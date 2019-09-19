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
        public IActionResult Todo(string username)
        {
            var user = userService.FindByUsername(username);
            return View(user);
        }

        [HttpPost("/todo/add")]
        public IActionResult AddTodo(string username, string title)
        {
            todoService.AddTodo(title, username);
            return RedirectToAction(nameof(TodoController.Todo), "Todo", new {username});
        }

        [HttpPost("/todo/delete")]
        public IActionResult DeleteTodo(int id, string username)
        {
            todoService.DeleteTodo(id);
            return RedirectToAction(nameof(TodoController.Todo), "Todo", new {username});
        }

        [HttpPost("/todo/edit")]
        public IActionResult RenderEdit(int id, string username)
        {
            var todo = todoService.FindTodoById(id);
            return View(todo);
        }

        [HttpPost("/todo/edited")]
        public IActionResult Edit(int id, int userid, string title)
        {
            var user = userService.FindByUserId(userid);
            string username = user.Name;
            
            todoService.EditTodo(id, title);
            
            return RedirectToAction(nameof(TodoController.Todo), "Todo", new {username});
        }

        [HttpPost("/todo/complete")]
        public IActionResult Complete(int id, string username)
        {
            todoService.CompleteTodo(id);
            return RedirectToAction(nameof(TodoController.Todo), "Todo", new {username});
        }
        
    }
}