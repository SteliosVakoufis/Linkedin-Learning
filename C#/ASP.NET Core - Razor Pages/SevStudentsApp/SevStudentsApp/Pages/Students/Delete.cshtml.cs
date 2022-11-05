using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using SevStudentsApp.DAO;
using SevStudentsApp.DTO;
using SevStudentsApp.Models;
using SevStudentsApp.Service;

namespace SevStudentsApp.Pages.Students
{
    public class DeleteModel : PageModel
    {
        private StudentDTO studentDTO;

        internal string errorMessage = "";

        private readonly IStudentService? service;
        public DeleteModel()
        {
            studentDTO = new();
            service = new StudentServiceImpl(new StudentDAOImpl());
        }

        public void OnGet()
        {
            try
            {
                Student student;
                
                int id = int.Parse(Request.Query["id"]);

                studentDTO.Id = id;
                
                student = service?.DeleteStudent(studentDTO);
                Response.Redirect("/Students/Index");
            }
            catch (Exception e)
            {
                errorMessage = e.Message;
            }
        }
    }
}
