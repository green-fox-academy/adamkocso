using Microsoft.AspNetCore.Mvc;
using TodoApp.Controllers.Todo;
using TodoApp.Servicies;

namespace TodoApp.Controllers.User
{
    public class UserController : Controller
    {
        private readonly IUserService userService;

        public UserController(IUserService userService)
        {
            this.userService = userService;
        }


        [HttpGet("/")]
        public IActionResult RenderLogin()
        {
            return View();
        }

        [HttpPost("/login")]
        public IActionResult Login(string username)
        {
            userService.AddUser(username);
            return RedirectToAction(nameof(TodoController.Todo), "Todo", new {username});
        }
    }
}