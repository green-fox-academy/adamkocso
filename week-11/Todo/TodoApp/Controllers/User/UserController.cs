using System.Threading.Tasks;
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

        [HttpPost("/")]
        public async Task<IActionResult> RenderLogin(Models.User user)
        {
            if (ModelState.IsValid)
            {
                string username = user.Name;
                await userService.AddUser(user);
                return RedirectToAction(nameof(TodoController.Todo), "Todo", new {username}); 
            }
            return View();
        }
    }
}