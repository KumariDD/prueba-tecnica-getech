
package employeetest;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kumari De Dios
 */
public final class EmployeeUtils {

    public EmployeeUtils() {
    }
    
    public static void registerEmployee (List<Employee> list, Scanner scanner) {
        EmployeeRequest request = new EmployeeRequest();
        
        System.out.println("Ingrese un nombre: ");
        request.setName(scanner.nextLine());
        
        System.out.println("Ingrese el apellido paterno: ");
        request.setLastNameFather(scanner.nextLine());
        
        System.out.println("Ingrese el apellido materno: ");
        request.setLastNameMother(scanner.nextLine());
        
        System.out.println("Ingrese la fecha de nacimiento: ");
        request.setBirthdate(scanner.nextLine());
    }
}
