package Day10;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new
				Scanner(System.in);
		System.out.print("Enter your name:");
		String name=sc.nextLine();
		System.out.println("My name is:"+name);
		sc.close();

	}

}
