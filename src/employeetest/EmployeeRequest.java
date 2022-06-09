

package employeetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Kumari De Dios
 */
public class EmployeeRequest {
    
    String pattern = "dd/MM/yyyy";
    SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
    
    private String name;
    
    private String lastNameFather;
    
    private String lastNameMother;
    
    private String birthdate;

    public EmployeeRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNameFather() {
        return lastNameFather;
    }

    public void setLastNameFather(String lastNameFather) {
        this.lastNameFather = lastNameFather;
    }

    public String getLastNameMother() {
        return lastNameMother;
    }

    public void setLastNameMother(String lastNameMother) {
        this.lastNameMother = lastNameMother;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    
    public boolean validate () {
        return (validateString(name) &&
                validateString(lastNameFather) &&
                validateString(lastNameMother) &&
                validateDate(birthdate)
                );
    }
    
    public boolean validateString (String string) {
        if(Objects.isNull(string) || string.isEmpty()) {
            System.out.println("La cadena no puede ser nula");
            return false;
        }
        if (!string.matches("[A-Z][ a-zA-Z]+")) {
            System.out.println("La cadena " + string +  "tiene un error, favor de verificar");
            return false;
        }
        return true;
    }
    
    public boolean validateDate (String string) {
        if(Objects.isNull(string) || string.isEmpty()) {
            System.out.println("La fecha no puede ser nula");
            return false;
        }
        if(!string.matches("[0-3][0-9]/[0-1][0-9]/[0-2][0-9]{3}")) {
            System.out.println("La fecha " + string +  "debe tener el formato dd/MM/yyyy");
            return false;
        }
        int day = Integer.valueOf(string.substring(0, 2));
        int month = Integer.valueOf(string.substring(3, 5));
        int year = Integer.valueOf(string.substring(6));
        return (day > 0 && day <= 31 &&
                month > 0 && month <= 12 &&
                year > 1900);
    }
    
    public LocalDate convertDate(String string) throws ParseException{
        Date date = dateFormat.parse(string);
        return date.toInstant()
                .atZone(ZoneId.systemDefault()).toLocalDate();
    }
    
    public Employee convert(Integer id) throws ParseException {
        Employee employee = new Employee(id);
        employee.setName(name);
        employee.setLastNameFather(lastNameFather);
        employee.setLastNameMother(lastNameMother);
        employee.setBirthdate(convertDate(birthdate));
        return employee;
    }
}
