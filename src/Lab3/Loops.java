package Lab3;

public class Loops {

	// 1) Main method
	public static void main(String[] args) {
		
		// Exercise 1: for loop
		//2) String references named daysOfWeek and initialize it with names of the days of the week
		String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		// 3A) Write for loop to print out each element of array
		for(int i = 0; i > daysOfWeek.length; i++) {
			
			String day = daysOfWeek[i];
			
			System.out.println(day);
			
		}
		
		// 3B) Do it again using for-next construct  - or enhanced for loop
		for(String day1: daysOfWeek) {
			// First part declares a variable that will hold each element of the array as the loop iterates through 
			// Second part is what you would like to loop through
			
			// Print each day
			System.out.println(day1);
			
		}
			
		// 4) Write another forloop to print out each element of the array in reverse
		
		for(int i = 6; i >= 0 ; i--) {
			System.out.println(daysOfWeek[i]);
			
		}
		
		
		// Exercise 2: While loop and continue
		
		// 5) Create a while loop that will print out only even numbers between 1 and 20
		
		int num = 2;
		
		while(num <= 20) {
			
			if(num % 2 == 0) {
				System.out.println(num); //
			}
			num++; //increment num by 1
		} 
		
		// 6) Use the continue statement and if statement to skip printing the odd numbers 
		// (so increment the counter by 1 each time through the loop)
		int num2 = 1;
		
		while(num2 <= 20) {
			num2++;
			if(num2 % 2 != 0) {
				System.out.println(num); //
			}
			num2++; //increment num by 1
		} 
		
		
		// Exercise 3: for loop
		// 7) create a for loop that will print out all numbers between 1 and 100 except 50 through 60.
		
		/*
		 * i think when i write this, i would need to 
		 * first put in an if statement.
		 * somehow if the number isnt 50 through 60, it will go ahead and print the number 
		 * and the for loop is inside
		 * 
		 */
	
		for(int i = 0; i <= 100; i++) {
			if(i < 50 || i > 60) {
				System.out.println(i);
			}
		}
		
		
		// Exercise 4: Switch statement
		// 8) Create a while loop that will execute the following code 12 times using a counter
		// that starts at 1 and is incremented by 1 each time through the loop.
		
		int i = 1;
		while(i <= 12) {
			
			// 9) Within the while loop, create a switch statement that will print out the number
			// of days in each of the months of the year.
//			switch(i) {
//				case 1:
//					System.out.println("January has 31 days in a month.");
//					break;
//				case 2:
//					System.out.println("February has 28 days in a month.");
//					break;
//				case 3:
//					System.out.println("March has 31 days in a month.");
//					break;
//				case 4: 
//					System.out.println("April has 30 days in a month.");
//					break;
//				case 5:
//					System.out.println("May has 31 days in a month.");
//					break;
//				case 6:
//					System.out.println("June has 30 days in a month.");
//					break;
//				case 7: 
//					System.out.println("July has 31 days in a month.");
//					break;
//				case 8:
//					System.out.println("August has 31 days in a month.");
//					break;
//				case 9: 
//					System.out.println("September has 30 days in a month.");
//					break;
//				case 10:
//					System.out.println("October has 31 days in a month.");
//					break;
//				case 11:
//					System.out.println("November has 30 days in a month.");
//					break;
//				case 12:
//					System.out.println("December has 31 days in a month.");
//					break;
//					default:
//						System.out.println("Invalid month");
//						break;
//						
					
					
			// 10) Use fall through capabilities so that you only have one print statement for all of the months that contain 31 days.
//			
//			switch(i) {
//			case 1:
//			case 3:
//			case 5:
//			case 7:
//			case 8:
//			case 10:
//			case 12:
//				System.out.println("Month " + i + " has 31 days.");
//				break;
//			case 4:
//			case 6:
//			case 9:
//			case 11:
//				System.out.println("Month " + i + " has 30 days.");
//				break;
//			case 2:
//				System.out.println("Month " + i + " has 28 days");
//				break;
//			default:
//				System.out.println("Invalid month");
//				break;
//			}

			// 11) Print out the name of the month as well.
			
			String[] monthNames = new String[] 
					{ "January", 
					"February", 
					"March", 
					"April", 
					"May", 
					"June", 
					"July", 
					"August", 
					"September", 
					"October", 
					"November", 
					"December"};
			
			switch(i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("The month " + monthNames[i-1] + " has 31 days.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("The month " + monthNames[i-1] + " has 30 days.");
				break;
			case 2:
				System.out.println("The month " + monthNames[i-1] + " has 28 days");
				break;
			default:
				System.out.println("Invalid month");
				break;
			}
			
			
			
			i++;
		}
		
		
		
			
	}

}
