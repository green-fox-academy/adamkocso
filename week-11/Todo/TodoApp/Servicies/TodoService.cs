using System.Linq;
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

        public void AddTodo(string title, string username)
        {
            if (title != null)
            {
                var user = userService.FindByUsername(username);
                var newTodo = new Todo {Title = title, IsDone = false, UserId = user.UserId};
                applicationContext.Todos.Add(newTodo);
                applicationContext.SaveChanges();


            }
        }

        public void DeleteTodo(int id)
        {
            var todo = FindTodoById(id);
            if (todo != null)
            {
                applicationContext.Todos.Remove(todo);
                applicationContext.SaveChanges();
            }
        }

        public Todo FindTodoById(int id)
        {
            var todo = applicationContext.Todos.FirstOrDefault(a => a.TodoId == id);
            if (todo == null)
            {
                return null;
            }

            return todo;
        }

        public void EditTodo(int id, string title)
        {
            var todo = FindTodoById(id);
            if (todo != null)
            {
                todo.Title = title;
                applicationContext.SaveChanges();
            }
        }
    }
}