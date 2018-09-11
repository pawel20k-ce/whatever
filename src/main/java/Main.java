import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by marcin on 23.06.2018.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/world?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "qwerty123");

            if(connection == null) {
                System.out.println("Nie połączono :(");
                return;
            }

            System.out.println("Wszystko OK");

        } catch (ClassNotFoundException e) {
            System.out.println("Nie ma sterownika JDBC do MySQL:(");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Coś poszło niee tak z SQL");
            e.printStackTrace();
        }
    }
}