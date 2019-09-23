using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using TodoApp.Models;

namespace TodoApp.Servicies
{
    public class TodoService : ITodoService
    {
        private readonly ApplicationContext applicationContext;
        private readonly IUserService userService;

        public TodoService(ApplicationContext applicationContext, IUserService userService)
        {
            this.applicationContext = applicationContext;
            this.userService = userService;
        }

        public async Task AddTodo(string title, string username)
        {
            if (title != null)
            {
                var user = await userService.FindByUsername(username);
                var newTodo = new Todo {Title = title, IsDone = false, UserId = user.UserId};
                applicationContext.Todos.Add(newTodo);
                await applicationContext.SaveChangesAsync();


            }
        }

        public async Task DeleteTodo(int id)
        {
            var todo = await FindTodoById(id);
            if (todo != null)
            {
                applicationContext.Todos.Remove(todo);
                await applicationContext.SaveChangesAsync();
            }
        }

        public async Task<Todo> FindTodoById(int id)
        {
            var todo = await applicationContext.Todos.FirstOrDefaultAsync(a => a.TodoId == id);
            if (todo == null)
            {
                return null;
            }

            return todo;
        }

        public async Task EditTodo(int id, string title)
        {
            var todo = await FindTodoById(id);
            if (todo != null)
            {
                todo.Title = title;
                await applicationContext.SaveChangesAsync();
            }
        }

        public async Task CompleteTodo(int id)
        {
            var todo = await FindTodoById(id);
            if (todo != null)
            {
                todo.IsDone = true;
                await applicationContext.SaveChangesAsync();
            }
        }
    }
}