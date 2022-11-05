using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using SevStudentsApp.DAO;
using SevStudentsApp.DTO;
using SevStudentsApp.Models;
using SevStudentsApp.Service;
using SevStudentsApp.Validator;

namespace SevStudentsApp.Pages.Students
{
    public class UpdateModel : PageModel
    {
        public StudentDTO? studentDTO;
        internal string errorMessage = "";

        private readonly IStudentService? service;
        public UpdateModel()
        {
            service = new StudentServiceImpl(new StudentDAOImpl());
        }

        public void OnGet(int id)
        {
            try
            {
                Student? student;

                student = service?.GetStudent(id);
                if (student is not null)
                {
                    studentDTO = ConvertToDTO(student!);
                }
            }
            catch (Exception e)
            {
                errorMessage = e.Message;
            }
        }

        public void OnPost()
        {
            errorMessage = "";

            studentDTO = new();

            studentDTO.Id = int.Parse(Request.Form["id"]);
            studentDTO.Firstname = Request.Form["firstname"];
            studentDTO.Lastname = Request.Form["lastname"];

            errorMessage = StudentValidator.Validate(studentDTO);

            if (!errorMessage.Equals("")) return;

            try
            {
                service?.UpdateStudent(studentDTO);
                Response.Redirect("/Students/Index");
            }
            catch (Exception e)
            {
                errorMessage = e.Message;
            }
        }

        private StudentDTO ConvertToDTO(Student student)
        {
            return new StudentDTO()
            {
                Id = student.Id,
                Firstname = student.Firstname,
                Lastname = student.Lastname,
            };
        }
    }
}
