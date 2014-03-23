import java.util.Scanner;

public class ChessGame {

	public static char turn = 'R';
	static Scanner scan = new Scanner(System.in);
	static String input = "";
	
	public static void main (String [] argv){
		System.out.println("Welcome to Chinese Chess by Bill");		
		System.out.println("Which side start first?");
		input = scan.nextLine();
		System.out.println(input + " will start 1st");
	}

}
