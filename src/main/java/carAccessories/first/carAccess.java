package carAccessories.first;
import java.util.LinkedList;
import java.util.Scanner;

public class carAccess {


	public static void main(String[] args) {


	    while(true) {

	    System.out.println("Welcome to our Car Accessories center do you have an account? y/n");
	    Scanner myObj = new Scanner(System.in);
	    String answer = myObj.nextLine();
	    String Email;
	    String Password;
	    if(answer.equals("y")) {
	    	System.out.println("Please enter your Email");
			Email= myObj.nextLine();
			System.out.println("Please enter your Password");
			Password= myObj.nextLine();



	    }
	    else{
	    	System.out.print(answer);
	    }}


	}



}
