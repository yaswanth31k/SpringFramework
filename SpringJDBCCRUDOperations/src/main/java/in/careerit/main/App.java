package in.careerit.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.careerit.beans.Dept;
import in.careerit.mapper.DeptRowMapper;
import in.careerit.resources.JavaConfigFile;

public class App {
	static JdbcTemplate jdbcTemplate = new AnnotationConfigApplicationContext(JavaConfigFile.class)
			.getBean(JdbcTemplate.class);

	public static boolean insert(String insertQuery, int deptNo, String dName, String loc) {
		int rowsAffected = jdbcTemplate.update(insertQuery, deptNo, dName, loc);
		return rowsAffected > 0;
	}

	public static boolean update(String updateQuery, int deptNo, String loc) {
		int rowsAffected = jdbcTemplate.update(updateQuery, deptNo, loc);
		return rowsAffected > 0;
	}

	public static boolean delete(String deleteQuery, int deptNo) {
		int rowsAffected = jdbcTemplate.update(deleteQuery, deptNo);
		return rowsAffected > 0;
	}

	public static List<Dept> getAllDepts(){
		String query = "SELECT * FROM DEPT";
		List<Dept> deptList = jdbcTemplate.query(query, new DeptRowMapper());
		return deptList;
	}
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int choice;
		do {
			System.out.println("M  E  N  U");
			System.out.println("1: insert ");
			System.out.println("2: update");
			System.out.println("3: delete");
			System.out.println("4: select");
			System.out.println("5: exit");
			System.out.println("read the choice");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("I N S E R T");
				String insertQuery = "INSERT INTO DEPT VALUES(?,?,?)";
				System.out.println("dept no:");
				int deptNo = sc.nextInt();
				System.out.println("dept name:");
				String dName = sc.next();
				System.out.println("location :");
				String loc = sc.next();
				boolean isInserted = insert(insertQuery, deptNo, dName, loc);
				if (isInserted)
					System.out.println("record inserted succeessfully");
				else
					System.out.println("failed to insert the record");
				break;
			case 2:
				System.out.println("update");
				String updateQuery = "UPDATE DEPT SET LOC=? WHERE DEPTNO=?";
				System.out.println("dept no:");
				deptNo = sc.nextInt();

				System.out.println("location :");
				loc = sc.next();

				boolean isupdate = update(updateQuery, deptNo, loc);
				if (isupdate)
					System.out.println("record updated succeessfully");
				else
					System.out.println("failed to updated the record");
				break;
			case 3:
				System.out.println("DELETE");
				String deleteQuery = "DELETE FROM DEPT WHERE DEPTNO=?";
				System.out.println("dept no:");
				deptNo = sc.nextInt();
				boolean isdelete = delete(deleteQuery, deptNo);
				if (isdelete)
					System.out.println("record DELETE succeessfully");
				else
					System.out.println("failed to DELETE the record");
				break;
			case 4:
				List<Dept> deptlist = getAllDepts();
				System.out.println("List of departments");
				System.out.println("====================");
				for (Dept dept : deptlist) {
					System.out.println(dept);
				}
				break;
			case 5:

				System.out.println("About to exit ...");
				break;
			default:
				System.out.println("Invalid choice try again...");
				break;

			}

		} while (choice != 5);
		System.out.println("End of application");

	}

}
