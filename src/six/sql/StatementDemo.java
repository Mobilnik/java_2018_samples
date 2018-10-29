package six.sql;

import java.sql.*;

public class StatementDemo {

    public static void main(String[] args) throws SQLException {
        //пример с русскоязычной википедии

        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/sample_database",
                "postgres", "postgres");
             Statement stmt = conn.createStatement()) {
            Class.forName("org.postgresql.Driver");

            if (conn == null) {
                System.out.println("Нет соединения с БД!");
                System.exit(0);
            }

            //Statement служит для исполнения запросов к БД

            //Result Set - набор строк из БД.
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            //rs.next() - работает не как итератор
            while (rs.next()) {
                System.out.println(
                        rs.getRow() + ". "
                                + rs.getString("first_name")
                                + " " + rs.getString("last_name"));
                //rs.get - показать, что там еще можно
            }


            // При закрытии Statement автоматически закрываются
            // все связанные с ним открытые объекты ResultSet
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        // обратить внимание, для чего используется блок finally
    }
}
