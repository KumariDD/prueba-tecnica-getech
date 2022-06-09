

package numbercounttest;

import java.util.Scanner;

/**
 *
 * @author Kumari De Dios
 */
public class NumberStringTest {
    
    public static int countNumbers (String string) {
        int counter = 0;

        char [] array = string.toCharArray();
        for (int index = 0; index < array.length; index++) {
            if (Character.isDigit(array[index])){
                counter ++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena");

        String testString = scanner.nextLine();

        int numberCount = countNumbers(testString);

        System.out.println(numberCount);

        scanner.close();
    }
}
