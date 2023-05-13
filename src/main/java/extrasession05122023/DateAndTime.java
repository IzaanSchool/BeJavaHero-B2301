package extrasession05122023;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy, hh:mm a");
        String str = formatter.format(date);
        System.out.println("The Current Date is: " + str);


        System.out.println("Card Expiration Date " + getAFutureDate("MM/dd/yyyy, hh:mm a",10));
    }
    public static String getAFutureDate(String formatInput, int daysToIncrease) {
        Date date = new Date();

        SimpleDateFormat bstFormat = new SimpleDateFormat(formatInput);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, daysToIncrease);
        Date printDate = cal.getTime();

        String futureDate = bstFormat.format(printDate);
        return futureDate;
    }
}
