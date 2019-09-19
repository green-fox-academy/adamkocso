namespace TodoApp.Models
{
    public class Todo
    {
        public int TodoId { get; set; }
        public string Title { get; set; }
        public bool IsDone { get; set; }
        public int UserId { get; set; }
    }
}