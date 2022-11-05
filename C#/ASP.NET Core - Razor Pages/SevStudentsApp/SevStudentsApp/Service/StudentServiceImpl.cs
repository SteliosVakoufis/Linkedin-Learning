using SevStudentsApp.DAO;
using SevStudentsApp.DTO;
using SevStudentsApp.Models;

namespace SevStudentsApp.Service
{
    public class StudentServiceImpl : IStudentService
    {
        private readonly IStudentDAO dao;

        public StudentServiceImpl(IStudentDAO dao)
        {
            this.dao = dao;
        }

        public List<Student> GetAllStudents()
        {
            try
            {
                return dao.GetAll();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
                return new List<Student>();
            }
        }

        public Student? DeleteStudent(StudentDTO? dto)
        {
            if (dto is null) return null;

            try
            {
                return dao.Delete(Convert(dto));
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
                return null;
            }
        }

        public Student? GetStudent(int id)
        {
            try
            {
                return dao.GetStudent(id);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
                return null;
            }
        }

        public void InsertStudent(StudentDTO dto)
        {
            if (dto is null) return;

            try
            {
                dao.Insert(Convert(dto));
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
                return;
            }
        }

        public void UpdateStudent(StudentDTO dto)
        {
            if (dto is null) return;

            try
            {
                dao.Update(Convert(dto));
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
                return;
            }
        }

        // Helper Functions
        private Student? Convert(StudentDTO dto)
        {
            return new Student()
            {
                Id = dto.Id,
                Firstname = dto.Firstname,
                Lastname = dto.Lastname,
            };
        }
    }
}
