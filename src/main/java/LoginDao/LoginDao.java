package LoginDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import ConnectionFactory.DBConnection;

public class LoginDao {

	public static boolean check(String uname, String pswd) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from bemp where bemp_name=? and age=?";
		try {
			con = DBConnection.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,uname);
			pstmt.setInt(2,Integer.parseInt(pswd));
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

}
