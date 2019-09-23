using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using TodoApp.Models;

namespace TodoApp.Servicies
{
    public class UserService : IUserService
    {
        private readonly ApplicationContext applicationContext;

        public UserService(ApplicationContext applicationContext)
        {
            this.applicationContext = applicationContext;
        }

        public async Task AddUser(User user)
        {
            var findUser = await FindByUsername(user.Name);
            if (findUser == null)
            {
                applicationContext.Users.Add(user);
                applicationContext.SaveChanges();
            } 
        }

        public async Task<User> FindByUsername(string username)
        {
            var user = await applicationContext.Users.Include(a => a.Todos).FirstOrDefaultAsync(a => a.Name == username);
            if (user == null)
            {
                return null;
            }

            return user;
        }

        public async Task<User> FindByUserId(int id)
        {
            var user = await applicationContext.Users.Include(a => a.Todos).FirstOrDefaultAsync(a => a.UserId == id);
            if (user == null)
            {
                return null;
            }

            return user;
        }
    }
}