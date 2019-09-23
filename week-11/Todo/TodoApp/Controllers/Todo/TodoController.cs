using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using TodoApp.Servicies;

namespace TodoApp.Controllers.Todo
{
    public class TodoController : Controller
    {
        private readonly IUserService userService;
        private readonly ITodoService todoService;

        public TodoController(IUserService userService, ITodoService todoService)
        {
            this.userService = userService;
            this.todoService = todoService;
        }

        [HttpGet ("/todo")]
        public async Task<IActionResult> Todo(string username)
        {
            var user = await userService.FindByUsername(username);
            return View(user);
        }

        [HttpPost("/todo/add")]
        public async Task<IActionResult> AddTodo(string username, string title)
        {
            await todoService.AddTodo(title, username);
            return RedirectToAction(nameof(TodoController.Todo), "Todo", new {username});
        }

        [HttpPost("/todo/delete")]
        public async Task<IActionResult> DeleteTodo(int id, string username)
        {
            await todoService.DeleteTodo(id);
            return RedirectToAction(nameof(TodoController.Todo), "Todo", new {username});
        }

        [HttpPost("/todo/edit")]
        public async Task<IActionResult> RenderEdit(int id, string username)
        {
            var todo = await todoService.FindTodoById(id);
            return View(todo);
        }

        [HttpPost("/todo/update")]
        public async Task<IActionResult> Edit(int id, int userid, string title)
        {
            var user = await userService.FindByUserId(userid);

            await todoService.EditTodo(id, title);
            
            return RedirectToAction(nameof(TodoController.Todo), "Todo", new {username = user.Name});
        }

        [HttpPost("/todo/complete")]
        public async Task<IActionResult> Complete(int id, string username)
        {
            await todoService.CompleteTodo(id);
            return RedirectToAction(nameof(TodoController.Todo), "Todo", new {username});
        }
        
    }
}