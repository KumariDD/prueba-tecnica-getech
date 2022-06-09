

package datetest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Kumari De Dios
 */
public class DateTest {
    
    public static boolean validateDate (String string) {
        if(Objects.isNull(string) || string.isEmpty()) {
            return false;
        }
        if(!string.matches("[0-3][0-9]/[0-1][0-9]/[0-2][0-9]{3}")) {
            return false;
        }
        int day = Integer.valueOf(string.substring(0, 2));
        int month = Integer.valueOf(string.substring(3, 5));
        int year = Integer.valueOf(string.substring(6));
        return (day > 0 && day <= 31 &&
                month > 0 && month <= 12 &&
                year > 1900);
    }
    
    public static void main(String[] args) {
        
        String test1 = "45/13/2002";
        System.out.println(test1);
        System.out.println("Valido " + validateDate(test1));
        
        String test2 = "03/02/2001";
        System.out.println(test2);
        System.out.println("Valido " + validateDate(test2));
        
        String test3 = "01/20/2010";
        System.out.println(test3);
        System.out.println("Valido " + validateDate(test3));
        
        String test4 = "02-04-2010";
        System.out.println(test4);
        System.out.println("Valido " + validateDate(test4));
        
        String test5 = "5/10/2003";
        System.out.println(test5);
        System.out.println("Valido " + validateDate(test5));
        
        String test6 = "15/3/2002";
        System.out.println(test6);
        System.out.println("Valido " + validateDate(test6));
        
        String test7 = "05/03/995";
        System.out.println(test7);
        System.out.println("Valido " + validateDate(test7));
        
        String test8 = "05/03/1995";
        System.out.println(test8);
        System.out.println("Valido " + validateDate(test8));
        
    }
    
}
