import java.util.Scanner;

public class Senior_Citizen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Age of the Person");
    int age =sc.nextInt();
    if (age>=60)
    {
    	System.out.println("The Person is a Senior Citizen" );
    	
    }
    else 
    {
    	System.out.println("The Person doesn't belong to the Senior Citizen Category");
    }
	}

}
