using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;

namespace TodoApp.Models
{
    public class User
    {
        public int UserId { get; set; }
        [Required (ErrorMessage = "Invalid username")]
        [MinLength(4, ErrorMessage = "Minimum 4 characters required")]
        [MaxLength(10, ErrorMessage = "Username max length is 10 characters")]
        public string Name { get; set; }
        [Required (ErrorMessage = "Invalid password")]
        [RegularExpression(@"^(?=.*[a-z])(?=.*[A-Z])(?=.*\d).{8,15}$", 
            ErrorMessage = "Password must contains at least one capital letter and number")]
        public string Password { get; set; }
        public List<Todo> Todos { get; set; }
    }
}