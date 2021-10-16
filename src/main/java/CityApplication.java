import java.sql.*;

public class CityApplication {
    private static Dao<City> cityDao;
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/{blogDb}","root","root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from  city_table");
            while (resultSet.next());
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
            connection.close();

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
