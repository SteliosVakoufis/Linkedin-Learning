using SevStudentsApp.DAO.DBUtil;
using SevStudentsApp.Models;
using System.Data.SqlClient;

namespace SevStudentsApp.DAO
{
    public class StudentDAOImpl : IStudentDAO
    {

        public List<Student> GetAll()
        {
            try
            {
                using var conn = DBHelper.GetConnection();

                conn?.Open();

                string sql = "SELECT * FROM STUDENTS";

                using var command = new SqlCommand(sql, conn);
                using var reader = command.ExecuteReader();


                List<Student> students = new();
                while (reader.Read())
                {
                    var student = new Student()
                    {
                        Id = reader.GetInt32(0),
                        Firstname = reader.GetString(1),
                        Lastname = reader.GetString(2),
                    };

                    students.Add(student);
                }

                return students;
            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
                throw e;
            }
        }

        public void Insert(Student? student)
        {
            if (student == null) return;

            try
            {
                using var conn = DBHelper.GetConnection();

                conn?.Open();

                string sql = "INSERT INTO STUDENTS" +
                    "(FIRSTNAME, LASTNAME) VALUES" +
                    "(@firstname, @lastname)";


                using var command = new SqlCommand(sql, conn);

                command.Parameters.AddWithValue("@firstname", student.Firstname);
                command.Parameters.AddWithValue("@lastname", student.Lastname);

                command.ExecuteNonQuery();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
                throw e;
            }
        }

        public void Update(Student? student)
        {
            if (student == null) return;

            try
            {
                using var conn = DBHelper.GetConnection();

                conn?.Open();

                string sql = "UPDATE STUDENTS SET FIRSTNAME = @firstname, " +
                    "LASTNAME = @lastname WHERE ID =@id";

                using var command = new SqlCommand(sql, conn);

                command.Parameters.AddWithValue("@firstname", student.Firstname);
                command.Parameters.AddWithValue("@lastname", student.Lastname);
                command.Parameters.AddWithValue("@id", student.Id);

                command.ExecuteNonQuery();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
                throw e;
            }
        }

        public Student? Delete(Student? student)
        {
            if (student == null) return null;

            try
            {
                using var conn = DBHelper.GetConnection();

                conn?.Open();

                string sql = "DELETE FROM STUDENTS WHERE ID = @id";

                using var command = new SqlCommand(sql, conn);

                command.Parameters.AddWithValue("@id", student.Id);

                int rowsAffected = command.ExecuteNonQuery();

                return (rowsAffected > 0) ? student: null;
            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
                throw e;
            }
        }

        public Student? GetStudent(int id)
        {
            Student? student = null;

            try
            {
                using var conn = DBHelper.GetConnection();

                conn?.Open();

                string sql = "SELECT * FROM STUDENTS WHERE ID = @id";

                using var command = new SqlCommand(sql, conn);

                command.Parameters.AddWithValue("@id", id);

                var reader = command.ExecuteReader();

                if (reader.Read())
                {
                    student = new()
                    {
                        Id = reader.GetInt32(0),
                        Firstname = reader.GetString(1),
                        Lastname= reader.GetString(2),
                };
                }

                return student;
            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
                throw e;
            }
        }

        
    }
}
