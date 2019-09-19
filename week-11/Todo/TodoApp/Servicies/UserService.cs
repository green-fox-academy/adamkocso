using System.Linq;
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

        public void AddUser(string username)
        {
            var user = FindByUsername(username);
            if (user == null)
            {
                var newUser = new User {Name = username};
                applicationContext.Users.Add(newUser);
                applicationContext.SaveChanges();
            }
        }

        public User FindByUsername(string username)
        {
            var user = applicationContext.Users.Include(a => a.Todos).FirstOrDefault(a => a.Name == username);
            if (user == null)
            {
                return null;
            }

            return user;
        }

        public User FindByUserId(int id)
        {
            var user = applicationContext.Users.Include(a => a.Todos).FirstOrDefault(a => a.UserId == id);
            if (user == null)
            {
                return null;
            }

            return user;
        }
    }
}