package DAO;

import java.sql.*;

import javax.sql.DataSource;
import javax.swing.UIDefaults.LazyValue;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import livevox.dbutils.DBType;
import livevox.dbutils.LVConnection;

class MysqlCon {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "R_s_@1995");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp_details");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		getMyDataSource();
	}
	public static DataSource getMyDataSource() {
		try {
			LVConnection cnn = LVConnection.openMySQLConnection("DB.LVOPRD_QAUAT.NAME");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	
}
