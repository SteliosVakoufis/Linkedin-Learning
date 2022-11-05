using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using SevStudentsApp.DAO;
using SevStudentsApp.Models;
using SevStudentsApp.Service;

namespace SevStudentsApp.Pages.Students
{
    public class IndexModel : PageModel
    {
        internal List<Student> students = new();

        private readonly IStudentService? service;
        public IndexModel()
        {
            service = new StudentServiceImpl(new StudentDAOImpl());
        }

        public IActionResult OnGet()
        {
            students = service!.GetAllStudents();
            return Page();
        }
    }
}
