import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import com.day.sql.Myconnection;

public class JDBCtest {
	public static void testUPDATE() {
		// DB연결
		Connection con = null;
		try {
			con = Myconnection.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// SQL구문 송신
		String updateSQL = "UPDATE customer SET name = '테스트' WHERE name LIKE '%n%'";
		Statement stmt = null;

		try {
			stmt = con.createStatement();
			int rowcnt = stmt.executeUpdate(updateSQL);
			System.out.println("총" + rowcnt + "건의 이름이 \'테스트\'로 변경되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void testUPDATE(String id, String pwd, String name) {
		// DB연결
		Connection con = null;
		try {
			con = Myconnection.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (pwd.equals("") & name.equals("")) {
			System.out.println("변경할 내용이 없습니다.");
			return;
		}

		// SQL구문 송신
		String updateSQL = "UPDATE customer SET ";

		if (!"".equals(pwd) && !"".equals(name)) {
			updateSQL += "pwd='" + pwd + "', name='" + name + "'";

		} else if (!"".equals(name)) {
			updateSQL += "name='" + name + "'";

		} else {
			updateSQL += "pwd='" + pwd + "'";
		}
		updateSQL += " WHERE id=?";

		// SQL구문 송신
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(updateSQL);
			pstmt.setString(1, id);
			int rowcnt = pstmt.executeUpdate();
			if (rowcnt == 1) {
				System.out.println(id + "고객의 내용이 변경되었습니다");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void testSELECT() {
		// DB연결
		Connection con = null;
		try {
			con = Myconnection.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// SQL 구문을 DB에 송신
		ResultSet rs = null;
		Statement stmt = null;
		String selectSQL = "SELECT employee_id, " + "first_name, " + "hire_date, " + "salary, "
				+ "salary+(salary*NVL(commission_pct, 0)) 실급여 " + "FROM employees";

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(selectSQL);
			System.out.println("SQL구문을 DB에 송신, 결과 수신");
			while (rs.next()) { // 결과행의 커서를 다음행으로 이동시킨다.
				int emp_id = rs.getInt("employee_id");
				String f_name = rs.getString(2);
				java.sql.Date hire_dt = rs.getDate("hire_date");
				int sal = rs.getInt("salary");
				float real_sal = rs.getFloat("실급여");

				System.out.println(emp_id + ":" + f_name + ":" + hire_dt + ":" + real_sal);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		finally {
			// DB와 연결 해제
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public static void testSELECT(String id) {
		// DB연결
		Connection con = null;
		try {
			con = Myconnection.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// SQL구문 송신

		String selectSQL = "SELECT pwd, name FROM customer WHERE id = ?";

		ResultSet rs = null;
		PreparedStatement pstmt = null;

		try {
			pstmt = con.prepareStatement(selectSQL);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				String f_pwd = rs.getString("pwd");
				String f_name = rs.getString("name");
				System.out.println(f_pwd + ":" + f_name);
			} else {
				// System.out.println("id가 존재하지 않습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return;
		} finally {
			// DB와 연결 해제
			com.day.sql.Myconnection.close(con, pstmt, rs);
		}

	}

	// SQL결과 수신
	// 결과활용
	// DB연결닫기

	public static void testINSERT(String id, String pwd, String name) {
		// DB연결
		Connection con = null;
		try {
			con = Myconnection.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// SQL구문 송신
		String insertSQL = "INSERT INTO customer(id, pwd, name) VALUES (?,?,?)";
		PreparedStatement pstmt = null;

		try {
			pstmt = con.prepareStatement(insertSQL);
			pstmt.setString(1, id); // 위의 ?의 개수만큼 setString 메서드가 호출되어야 한다.
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			int rowcnt = pstmt.executeUpdate();
			if (rowcnt == 1) {
				System.out.println(id + "번 고객 추가 성공");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

		// SQL결과 수신
		// 결과활용
		// DB연결닫기
	}

	public static void testINSERT() {
		// DB연결
		Connection con = null;
		try {
			con = Myconnection.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// SQL구문 송신
		String insertSQL = "INSERT INTO customer(id, pwd, name) VALUES ('id9', 'p9', 'n9')";
		Statement stmt = null;

		try {
			stmt = con.createStatement();
			int rowcnt = stmt.executeUpdate(insertSQL);
			if (rowcnt == 1) {
				System.out.println("id9번 고객 추가 성공");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

		// SQL결과 수신
		// 결과활용
		// DB연결닫기
	}

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC드라이버 로드 성공");
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		// testSELECT();
		// testINSERT();
		// testUPDATE();

		// 키보드로 입력받은 id, pwd, name 값을 customer테이블에 추가
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디:");
		String idValue = sc.nextLine();
		// testSELECT(idValue); // 비번과 이름이 출력되도록. PreparedStatement 활용

		System.out.println("비밀번호를 변경하려면 값을 입력하세요.[변경하지 않으려면 Enter을 누르세요] : ");
		String pwdValue = sc.nextLine(); // enter을 누른경우 pwdValue변수값은 ""가 된다.
		// System.out.println("입력한 비밀번호값 :[" + pwdValue + "]");
		System.out.println("이름을 변경하려면 값을 입력하세요.[변경하지 않으려면 Enter을 누르세요] : ");
		String nameValue = sc.nextLine();
		testUPDATE(idValue, pwdValue, nameValue); // 총 경우의 수는 4개

	}

}
