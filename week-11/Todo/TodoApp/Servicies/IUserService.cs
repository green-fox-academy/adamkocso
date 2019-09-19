using TodoApp.Models;

namespace TodoApp.Servicies
{
    public interface IUserService
    {
        void AddUser(string username);
        User FindByUsername(string username);
        User FindByUserId(int id);
    }
}