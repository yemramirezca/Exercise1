import java.util.Scanner;

/**
 * Class that...
 * @author Yesika Ramirez
 * */
public class HelloUser {
	
	private static String userName;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.print("please enter yout name: ");
		userName = input.nextLine();
		greetUser();
	}
	
	public static void greetUser(){
		System.out.println("Hello " + userName + "!");
	}

}
