package digital;

import java.util.Calendar;
 
public class Helloworld {
   public static void main(String[] args) {
      Calendar cal = Calendar.getInstance();
      System.out.println("Current week of month is : " +cal.get(Calendar.WEEK_OF_MONTH));
      System.out.println("Current week of year is : " +cal.get(Calendar.WEEK_OF_YEAR));
      cal.add(Calendar.WEEK_OF_YEAR, 52);
      System.out.println(
         "date after one year : " + (cal.get(Calendar.WEEK_OF_YEAR))+ "-"+ cal.get(Calendar.DATE)+ "-"+ cal.get(Calendar.YEAR)); 
   }
}