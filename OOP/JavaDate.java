
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class  JavaDate{


    public static void main(String[] args){
        //Date
        LocalDate checkDate =  LocalDate.now();
        // Time
        LocalTime checkTime = LocalTime.now();
        System.out.println("The date today is "+checkDate+ " and Time is "+checkTime);

        System.out.println("__________________________");
        // Date and time
        LocalDateTime checkDateandTime = LocalDateTime.now();

        // Formatting
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        String formattedDate = checkDateandTime.format(myFormatObj);

        System.out.println("Todate and time are: "+ formattedDate);
        System.out.println("__end__");
    }
}