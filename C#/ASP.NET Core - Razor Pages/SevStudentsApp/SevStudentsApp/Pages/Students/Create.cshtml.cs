using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using SevStudentsApp.DAO;
using SevStudentsApp.DTO;
using SevStudentsApp.Service;
using SevStudentsApp.Validator;

namespace SevStudentsApp.Pages.Students
{
    public class CreateModel : PageModel
    {
        internal StudentDTO studentDTO;
        internal string errorMessage = "";

        private readonly IStudentService? service;
        public CreateModel()
        {
            studentDTO = new StudentDTO();
            service = new StudentServiceImpl(new StudentDAOImpl());
        }

        public void OnGet()
        {

        }

        public void OnPost()
        {
            studentDTO.Firstname = Request.Form["firstname"];
            studentDTO.Lastname = Request.Form["lastname"];

            errorMessage = StudentValidator.Validate(studentDTO);

            if (!errorMessage.Equals("")) return;

            try
            {
                service?.InsertStudent(studentDTO);
                Response.Redirect("/Students/Index");
            }
            catch (Exception e)
            {
                errorMessage = e.Message;
                return;
            }
        }
    }
}
