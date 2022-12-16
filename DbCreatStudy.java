import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbCreatStudy {

	public DbCreatStudy() {
		// TODO Auto-generated constructor stub

		String url = "jdbc:mysql://localhost/?" + "CharacterEncoding=UTF-8&" + "serverTimezone=UTC&"
				+ "allowPublicKeyRetrieval=true&" + "allowLoadLocalInfile=true&" + "allowMultiQueries=true";

		String id = "root";
		String pw = "1234";

		try {
			Connection con = DriverManager.getConnection(url, id, pw);
			System.out.println("connecting succeed");
			Statement stmt = con.createStatement();

			stmt.executeUpdate("DROP SCHEMA IF EXISTS `Dbstudy` ;\r\n"
					+ "CREATE SCHEMA IF NOT EXISTS `Dbstudy` DEFAULT CHARACTER SET utf8 ;\r\n" + "");
			System.out.println("Creat DataBase");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
