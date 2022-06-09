

package employeetest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
        return string.matches("[A-Z][a-zA-Z]+");
    }
    
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
        return (day > 0 && day < 31 &&
                month > 0 && month < 12 &&
                year > 1900);
    }
    
    public void convert(Integer id) {
        Employee employee = new Employee(id);
        
    }
}
