package A_1_testing;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		String words = new String();
		
		Scanner sc= new Scanner(System.in);

		words = sc.nextLine().trim();
		
		if (!words.isEmpty()) {
			String[] output = words.split(" ");
			
			System.out.println(output.length);
        } else {
        	System.out.println(0);
        }
	}
}

