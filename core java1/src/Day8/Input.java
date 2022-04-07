package Day8;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br =  new BufferedReader(is);
		System.out.println("Enter the first String");
		String a=(br.readLine());
		System.out.println("Enter the secomd String");
		String b=(br.readLine());
		String m=a+b;
		System.out.println("combination ::"+m);

	}

}
