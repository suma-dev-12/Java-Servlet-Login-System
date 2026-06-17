package ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/advance_java";
		String un = "root";
		String pswd = "sum@23ma@45";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, un, pswd);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	 return	con;

	}

}
