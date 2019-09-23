using System.Threading.Tasks;
using TodoApp.Models;

namespace TodoApp.Servicies
{
    public interface IUserService
    {
        Task AddUser(User user);
        Task<User> FindByUsername(string username);
        Task<User> FindByUserId(int id);
    }
}