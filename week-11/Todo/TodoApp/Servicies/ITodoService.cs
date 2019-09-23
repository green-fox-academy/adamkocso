using System.Threading.Tasks;
using TodoApp.Models;

namespace TodoApp.Servicies
{
    public interface ITodoService
    {
        Task AddTodo(string title, string username);
        Task DeleteTodo(int id);
        Task<Todo> FindTodoById(int id);
        Task EditTodo(int id, string title);
        Task CompleteTodo(int id);
    }
}