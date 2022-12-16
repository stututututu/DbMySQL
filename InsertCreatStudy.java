import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertCreatStudy {
	public InsertCreatStudy() {
		

		String url = "jdbc:mysql://localhost/?" + "CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
				+ "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";

		String id = "root";
		String pw = "1234";
		try {
			Connection con = DriverManager.getConnection(url, id, pw);
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("INSERT INTO `Dbstudy`.`table1` (`u_no`, `u_name`, `u_id`, `u_pw`, `u_birth`, `division`, `t_no`) VALUES ('1', '김성재', 'a', 'abc231', '1999-09-09', '1', '0');\r\n"
					+ "INSERT INTO `Dbstudy`.`table1` (`u_no`, `u_name`, `u_id`, `u_birth`, `division`, `t_no`) VALUES ('2', '김준우', 'b', '1999-01-01', '2', '1');\r\n"
					+ "INSERT INTO `Dbstudy`.`table1` (`u_no`, `u_name`, `u_id`, `u_pw`, `u_birth`, `division`, `t_no`) VALUES ('3', '박힘찬', 'c', 'qwer11', '2000-01-03', '1', '2');\r\n"
					+ "INSERT INTO `Dbstudy`.`table1` (`u_no`, `u_name`, `u_id`, `u_pw`, `u_birth`, `division`, `t_no`) VALUES ('4', '이재훈', 'd', 'ww33', '2001-03-16', '1', '3');\r\n"
					+ "");
			System.out.println("Creat insert");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
