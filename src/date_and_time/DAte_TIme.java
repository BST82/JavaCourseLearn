package date_and_time;
import java.time.LocalDate; // import the LocalDate class
import java.time.LocalDateTime;
import java.time.LocalTime; // import the LocalTime class
import java.time.format.DateTimeFormatter;
public class DAte_TIme {

	public static void main(String[] args) {
		
	 //1)-----------Display Current Date---------
		LocalDate myObj = LocalDate.now(); // Create a date object
	    System.out.println(myObj); // Display the current date
	
	
	  //2)-----------Display Current Time---------
	
	    LocalTime myObj2 = LocalTime.now();
	    System.out.println(myObj2);
	
	    
	  //3------------------Display Current Date and Time--------
	    LocalDateTime myObj3 = LocalDateTime.now();
	    System.out.println(myObj3);
	    
	    
	  //4----------Formatting Date and Time---------------
	    LocalDateTime myDateObj4 = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj4);
	    DateTimeFormatter myFormatObj4 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = myDateObj4.format(myFormatObj4);
	    System.out.println("After formatting: " + formattedDate);
	}

}
