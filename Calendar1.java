/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	    int numberOfSundaysOnFirst = 0;


	 	while (year < 2000 && month <= 12 && dayOfMonth <=31) {
	 		System.out.print(dayOfMonth + "/" + month + "/" + year);
	    	if (dayOfWeek == 1){
	    		System.out.println (" Sunday");
	    	}
	    	else {
	    		System.out.println();
	    	}
	    	if ((dayOfWeek == 1) && (dayOfMonth == 1)){
	    		numberOfSundaysOnFirst++;
	    	}		
	 		advance();
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if (false) { 
	 			break;
	 		}
        }
	 	System.out.println ("During the 20th century, " + numberOfSundaysOnFirst + " Sundays fell on the first day of the month");
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		dayOfMonth++;
		if (dayOfMonth > nDaysInMonth){
			month++;
			dayOfMonth = 1;
			nDaysInMonth = nDaysInMonth(month, year);
		}
		if (month > 12){
			year++;
			month = 1;
		}
		dayOfWeek = (dayOfWeek + 1) % 7;
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	      if ((year % 400) == 0) {
		    return true;
		}
		if ( ((year % 4) == 0) && ((year % 100) != 0) ) {
			return true;
		}
		return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
				if (month == 1){
			return 31;
		}
		if (month == 2 && isLeapYear(year) == true){
			return 29;
		}
		if (month == 2 && isLeapYear(year) == false){
			return 28;
		}
		if (month == 3){
			return 31;
		}
		if (month == 4){
			return 30;
		}
		if (month == 5){
			return 31;
		}
		if (month == 6){
			return 30;
		}
		if (month == 7){
			return 31;
		}
		if (month == 8){
			return 31;
		}
		if (month == 9){
			return 30;
		}
		if (month == 10){
			return 31;
		}
		if (month == 11){
			return 30;
		}
		if (month == 12){
			return 31;
		}
		return 0;
	}
}