package Day42;

import java.util.Scanner;

public class TwodimensionalScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter row length of an array : ");
int row = sc.nextInt();
System.out.println("enter column length of an array : ");
int column = sc.nextInt();
int a[][]=new int[row][column];
System.out.print("enter " + row*column + " elements to store in array : \n");
for(int i=0;i<row;i++)
{
	for(int j=0;j<column;j++)
	{
		a[i][j]=sc.nextInt();
	}
}
System.out.print("enter " + row*column + " elements in array are : \n");
for(int i=0;i<row;i++)
{
	for(int j=0;j<column;j++)
	{
System.out.println("Row ["+i+"]: Colunn ["+j+"] :"+a[i][j]);

	}

}
	}
}
