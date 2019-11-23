package lt.sdacademy.fundamentals.date_time;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
public class Example1 {
    public static void main(String[] args) {
        Date now = new Date ();
        // Arba
        long mills=System.currentTimeMillis();
        now = new Date (mills);
        System.out.println(now);//

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();// konvertuojamas Calnedar objekas i Date objekta
        System.out.println(date);

        cal.setTime(now);// konvertuojamas Date objekas i Calendar objekta

        System.out.println(cal.get(Calendar.YEAR));
        //System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));

        String dateInText = "2019-02-18";
        LocalDate localDate = LocalDate.parse(dateInText);// is teksto pakeiciame i data
        System.out.println(localDate);
    }
}
