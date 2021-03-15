package p2021_02_18;

import java.io.*;

public class BufferedReaderTest {			//입력한 한 줄 전체 다 읽음(영어 한글 숫자 구분없이 가능)
    public static void main( String[] args ) {
		
	InputStream is = System.in;
	InputStreamReader isr = new InputStreamReader( is );
	BufferedReader br = new BufferedReader( isr );
/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
*/
	System.out.print( "Input Data : " );
		
	try {//입력한 한줄을 모두읽음.
	    String inputString = br.readLine();		// 띄어쓰기도 가능
	    System.out.println();
	    System.out.println("Output String = " + inputString );	   
	} catch ( IOException io ) {
	    System.out.println( io.getMessage() );
	}
    }//main() end
}
