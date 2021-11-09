package session1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Write a program that produces the following output:
 * ********************************************
 * Today is Friday, 29. Oktober 2021!
 * Welcome to DLBCSOOPJ01!
 * ********************************************
 */
public class Task1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2021, 10, 29);
        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ENGLISH);
        System.out.println("********************************************");
        System.out.println("Today is " + df.format(today));
        System.out.println("Welcome to DLBCSOOPJ01!");
        System.out.println("********************************************");

    }
}
