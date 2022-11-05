using System.Data.SqlClient;

namespace SevStudentsApp.DAO.DBUtil
{
    public class DBHelper 
    {
        private static SqlConnection? conn;

        private DBHelper() { }

        public static SqlConnection? GetConnection()
        {
            try
            {
                ConfigurationManager cManager = new();
                cManager.AddJsonFile("appsettings.json");
                conn = new(cManager.GetConnectionString("SevDB"));
                return conn;

            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
                return null;
            }
        }

        public static void CloseConnection()
        {
            conn?.Close();
        }
    }
}
