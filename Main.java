import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String sql = "SELECT student_id FROM student where student_id = 1";
        String url = "jdbc:mysql://localhost:3306/vamsi";
        String username="root";
        String password = "Vamsi@1";

        Connection con = DriverManager.getConnection(url,username,password);

        Statement st = con.createStatement();
        st.executeQuery(sql);

        ResultSet rs = st.executeQuery(sql);
        rs.next();

        String name = rs.getString(1);
        System.out.println(name);
        con.close();
    }
}