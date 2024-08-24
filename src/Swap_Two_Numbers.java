import java.util.Scanner;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println( " Enter the value of x and y");
		int x = sc.nextInt();		
		int y = sc.nextInt();
		System.out.println("The value of x and y before swapping " + x +" " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println( "The value of x and y after swapping "+x+ " " +y);
		
	}

}
