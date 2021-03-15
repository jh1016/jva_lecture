package p2021_02_23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Deleteboard2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("삭제할 글번호를 입력 하세요?");
			int no = Integer.parseInt(br.readLine());
			
			String sql = "delete from board whrer no = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			int result = pstmt.executeUpdate();
			if(result ==1 ) {
				System.out.println("글삭세 성공");
			}else {
				System.out.println("글삭제 실패");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("글번호를 입력 하세요.");
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				
			}
		}
	}

}
