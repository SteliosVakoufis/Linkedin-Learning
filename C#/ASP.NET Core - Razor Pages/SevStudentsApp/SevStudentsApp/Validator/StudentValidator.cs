using SevStudentsApp.DTO;

namespace SevStudentsApp.Validator
{
    public class StudentValidator
    {
        // No Instances of this class should be available
        private StudentValidator() { }

        public static string Validate(StudentDTO? dto)
        {
            if (dto?.Firstname?.Length < 4 || dto?.Lastname?.Length < 4)
            {
                return "Firstname or Lastname should not be less than 4 characters long.";
            }

            return "";
        }
    }
}
