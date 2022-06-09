
package employeetest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kumari De Dios
 */
public class MenuTest {
    
    public static void main(String[] args) throws Exception{
        List<Employee> employeeList = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        
        while (repeat) {
            System.out.println("--- Menu principal ---");
            System.out.println("--- 1) Registrar empleado ---");
            System.out.println("--- 2) Obtener edad de un empleado ---");
            System.out.println("--- 3) Lista de empleados ordenados por apellido ---");
            System.out.println("--- 4) Lista de empleados ordenados por edad ---");
            System.out.println("--- 5) Salir ---");
            
            String option = scanner.nextLine();
            
            switch(option) {
                case "1":
                    EmployeeUtils.registerEmployee(employeeList, scanner);
                    break;
                case "2":
                    EmployeeUtils.obtainEmployeeAge(employeeList, scanner);
                    break;
                case "3":
                    EmployeeUtils.obtainOrderedListLastName(employeeList);
                    break;
                case "4":
                    EmployeeUtils.obtainOrderedListAge(employeeList);
                    break;
                case "5":
                    repeat = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
    
}
