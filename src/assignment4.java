import java.util.ArrayList;
import java.util.Scanner;

public class assignment4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> userArray = new ArrayList<Integer>();
		System.out.println("Enter integers to be added to the list. Press \"q\" to quit.");
		int total;

		// Get user input and add to userArray
		while (scan.hasNextInt()) {
			total = scan.nextInt();
			userArray.add(total);
		}
		
		total = scan.nextInt();
		scan.close();

		
	}
	
	boolean isTotalInList(ArrayList<Integer> numbers, int total) {
		
		// search for the total in list, returning true if the total is found
		for (int i = 0; i < numbers.size(); ++i) {
			for (int j = i; j < numbers.size(); ++j) {
				if (numbers.get(i) + numbers.get(j) == total) {
					return true;
				}
			}
		}
		
		// if total was not found, return false
		return false;
	}

}
