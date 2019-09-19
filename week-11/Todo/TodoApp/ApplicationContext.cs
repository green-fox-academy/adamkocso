using Microsoft.EntityFrameworkCore;
using TodoApp.Models;

namespace TodoApp
{
    public class ApplicationContext : DbContext
    {
        public DbSet<Todo> Todos { get; set; }
        public DbSet<User> Users { get; set; }
        
        public ApplicationContext(DbContextOptions options) : base(options)
        {
        }
    }
}