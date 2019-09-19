using TodoApp.Models;

namespace TodoApp.Servicies
{
    public interface ITodoService
    {
        void AddTodo(string title, string username);
        void DeleteTodo(int id);
        Todo FindTodoById(int id);
        void EditTodo(int id, string title);
    }
}