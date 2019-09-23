using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using TodoApp.Servicies;


namespace TodoApp.Controllers.Rest
{
    
    [Route("api")]
    [ApiController]
    public class RestController : ControllerBase
    {
        private readonly UserService userService;
        private readonly TodoService todoService;

        public RestController(UserService userService, TodoService todoService)
        {
            this.userService = userService;
            this.todoService = todoService;
        }

        [HttpPost("/login")]
        public async Task<Models.User> Login(Models.User user)
        {
            if (user != null)
            {
                await userService.AddUser(user);
                return user;
            }
            return null;
        }    
    }
}