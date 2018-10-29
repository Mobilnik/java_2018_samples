package six.sql;

import java.sql.*;

public class PreparedStatementDemo {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/sample_database",
                    "postgres", "postgres");

            if (conn == null) {
                System.out.println("Нет соединения с БД!");
                System.exit(0);
            }
            ResultSet rs;
            //Пример 1 - 1 х ?
/*          PreparedStatement stmt1 = conn.prepareStatement("SELECT * FROM users WHERE first_name = ?");
            //нумерация параметров с 1
            stmt1.setString(1, "Иван");
            ResultSet rs = stmt1.executeQuery();
            while (rs.next()) {
                System.out.println(
                        rs.getRow() + ". "
                                + rs.getString("first_name")
                                + " " + rs.getString("last_name"));
            }*/

            //Пример 2 - 2 х ?
 /*           PreparedStatement stmt2 = conn.prepareStatement("SELECT * FROM users WHERE first_name = ? and last_name = ?");
            stmt2.setString(1, "Иван");
            //если параметра нет
            stmt2.setString(2, "Иванов");
            rs = stmt2.executeQuery();
            while (rs.next()) {
                System.out.println(
                        rs.getRow() + ". "
                                + rs.getString("first_name")
                                + " " + rs.getString("last_name"));
            }
            stmt2.close();*/

            //Пример 3 - 1 х :param
            //А нету :Р, не умеет JDBC  так.
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
}
