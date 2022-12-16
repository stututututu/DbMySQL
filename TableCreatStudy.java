import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableCreatStudy {
	public TableCreatStudy() {

		String url = "jdbc:mysql://localhost/?" + "CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
				+ "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";

		String id = "root";
		String pw = "1234";

			try {
				Connection con = DriverManager.getConnection(url, id, pw);
				
				Statement stmt = con.createStatement();
				
				stmt.execute("CREATE TABLE IF NOT EXISTS `Dbstudy`.`table1` (\r\n"
						+ "  `u_no` INT NOT NULL,\r\n"
						+ "  `u_name` VARCHAR(45) NULL,\r\n"
						+ "  `u_id` VARCHAR(45) NULL,\r\n"
						+ "  `u_pw` VARCHAR(45) NULL,\r\n"
						+ "  `u_birth` VARCHAR(45) NULL,\r\n"
						+ "  `division` INT NULL,\r\n"
						+ "  `t_no` INT NULL,\r\n"
						+ "  PRIMARY KEY (`u_no`))");
				System.out.println("Creat table");
				
			} catch (Exception e) {
				// TODO: handle exception
				
				e.printStackTrace();
			}
	}
}
