package p2021_02_23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InserBoard2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);	//jdbc driver를 제일 먼저 로딩
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("작성자명을 입력하세요?");
			String writer = br.readLine();
			System.out.println("비밀번호를 입력하세요?");
			String passwd = br.readLine();
			System.out.println("제목을 입력하세요?");
			String subject = br.readLine();
			System.out.println("내용을 입력하세요?");
			String content = br.readLine();
			
			String sql = "insert into board ";
				   sql += " values(board_seq.nextval,?,?,?,?,sysdate)";
				  
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
				   
			int result = pstmt.executeUpdate(); 	//SQL문 실행
			if(result == 1) {
				System.out.println("글작성 성공");
			}else {
				System.out.println("글작성 실패");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("예외발생");
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
