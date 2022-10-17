package jdbcExample;

import java.sql.*;
/*
 CREATE TABLE `emp` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `FIRST_NAME` varchar(50) NOT NULL,
  `LAST_NAME` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
);

 */

class Emp{
	
}



public class MySqlConnect {
	public static void main(String[] args) {
		useSelect();
		useInsert();
		useSelect();

	}

	public static void useInsert() {
		try {
			System.out.println("methods useInsert");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_example", "root", "1qaz+2wsx");
			PreparedStatement stmt = con.prepareStatement("insert into emp values(null, ?,?)");
			long mls = System.currentTimeMillis();
			stmt.setString(1, "Ivanov_" + mls);// 1 specifies the first parameter in the query
			stmt.setString(2, "Petr_" + mls);
			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void useSelect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_example", "root", "1qaz+2wsx");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void useUpdate() {

	}

}
