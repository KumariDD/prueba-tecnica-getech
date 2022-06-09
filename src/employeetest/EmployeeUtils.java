
package employeetest;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Kumari De Dios
 */
public final class EmployeeUtils {

    public EmployeeUtils() {
    }
    
    public static void registerEmployee (List<Employee> list, Scanner scanner) throws ParseException {
        EmployeeRequest request = new EmployeeRequest();
        
        System.out.println("Ingrese un nombre: ");
        request.setName(scanner.nextLine());
        
        System.out.println("Ingrese el apellido paterno: ");
        request.setLastNameFather(scanner.nextLine());
        
        System.out.println("Ingrese el apellido materno: ");
        request.setLastNameMother(scanner.nextLine());
        
        System.out.println("Ingrese la fecha de nacimiento (Formato dd/MM/yyyy): ");
        request.setBirthdate(scanner.nextLine());
        
        if(request.validate()){
            Employee employee = request.convert(list.size());
            list.add(employee);
            System.out.println("Agregado exitoso");
        } else {
            System.out.println("Hubo un error al ingresar los datos");
        }
    }
    
    public static void obtainEmployeeAge (List<Employee> list, Scanner scanner) {
        if(list.size() == 0){
            System.out.println("Lista de empleados vacia");
            return;
        }
        
        System.out.println("Ingrese un numero: ");
        String number = scanner.nextLine();
        
        if(!number.matches("[0-9]+")){
            System.out.println("Caracter incorrecto, debe ingresarse un numero");
            return;
        }
        
        int id = Integer.valueOf(number);
        
        if(id < 0 || id > list.size() - 1 ){
            System.out.println("Id no válido, empleado inexistente");
            return;
        }
        
        Employee employee = list.get(id);
        if(Objects.isNull(employee)) {
            System.out.println("Id no válido, empleado inexistente");
            return;
        } else {
            int years = (int) ChronoUnit.YEARS.between(employee.getBirthdate(), LocalDate.now());
            System.out.println("Edad del empleado: " + years);
        }
    }
    
    public static void obtainOrderedListLastName (List<Employee> list) {
        List<Employee> sortedEmployees = list.stream().sorted(
                Comparator.comparing(Employee::getLastNameFather)
        ).collect(Collectors.toList());
        for(Employee e : sortedEmployees) {
            System.out.println(e.toString());
        }
    }
    
    public static void obtainOrderedListAge (List<Employee> list) {
        List<Employee> sortedEmployees = list.stream().sorted(
                Comparator.comparing(Employee::getBirthdate)
        ).collect(Collectors.toList());
        for(Employee e : sortedEmployees) {
            System.out.println(e.toString());
        }
    }
}
