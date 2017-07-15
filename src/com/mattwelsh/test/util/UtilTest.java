package com.mattwelsh.test.util;

import com.mattwelsh.util.JulianDate;
import com.mattwelsh.util.TimeSpan;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UtilTest {

    public static void main(String[] args) {

        testTimeSpan();
    }


    private static void testTimeSpan() {

        TimeSpan span2 = new TimeSpan(new GregorianCalendar(2001, 5, 1), new GregorianCalendar(2001, 5, 18));

        //System.out.println(span2.getCenturies());
        assert (span2.getCenturies() == 0);
        //System.out.println(span2.getDecades());
        assert (span2.getDecades() == 0);
        //System.out.println(span2.getYears());
        assert (span2.getYears() == 0);
        //System.out.println(span2.getMonths());
        assert (span2.getMonths() == 0);
        //System.out.println(span2.getWeeks());
        assert (span2.getWeeks() == 2);
        //System.out.println(span2.getDays());
        assert (span2.getDays() == 18310);
        System.out.println("//----------------------------------//");
        System.out.println("End TimeSpan Test 1");
        System.out.println("//----------------------------------// \n\n");

        span2 = new TimeSpan(new GregorianCalendar(1964, 5, 1), new GregorianCalendar(2014, 6, 18));
        //System.out.println(span2.getCenturies());
        assert (span2.getCenturies() == 0);
        //System.out.println(span2.getDecades());
        assert (span2.getDecades() == 5);
        //System.out.println(span2.getYears());
        assert (span2.getYears() == 50);
        //System.out.println(span2.getMonths());
        assert (span2.getMonths() == 601);
        //System.out.println(span2.getDays());
        assert (span2.getDays() == 18310);

        System.out.println("//----------------------------------//");
        System.out.println("End TimeSpan Test 2");
        System.out.println("//----------------------------------// \n\n");

        span2 = new TimeSpan(new GregorianCalendar(2014, 1, 1), new GregorianCalendar(2014, 12, 31));
        //System.out.println(span2.getCenturies());
        assert (span2.getCenturies() == 0);
        //System.out.println(span2.getDecades());
        assert (span2.getDecades() == 0);
        //System.out.println(span2.getYears());
        assert (span2.getYears() == 0);
        //System.out.println(span2.getMonths());
        assert (span2.getMonths() == 11);
        //System.out.println(span2.getDays());
        assert (span2.getDays() == 364);

        System.out.println("//----------------------------------//");
        System.out.println("End TimeSpan Test 3");
        System.out.println("//----------------------------------// \n\n\n\n\n\n\n");

        span2 = new TimeSpan(new GregorianCalendar(2017, 5, 16), 2.25278757866539);
        //span2 = new TimeSpan(new GregorianCalendar(), 2.0);

        GregorianCalendar greg = span2.getEndDateGregorian();

        assert greg != null;

        System.out.println("Computed Date: " + greg.get(Calendar.MONTH) + "/" + greg.get(Calendar.DAY_OF_MONTH) + "/" +
                greg.get(Calendar.YEAR) + " at " + greg.get(Calendar.HOUR_OF_DAY) + ":" +
                greg.get(Calendar.MINUTE) + ":" + greg.get(Calendar.SECOND) + "." +
                greg.get(Calendar.MILLISECOND));

    }

}
