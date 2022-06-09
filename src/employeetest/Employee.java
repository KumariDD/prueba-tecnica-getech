
package employeetest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 *
 * @author Kumari De Dios
 */
public class Employee {
    
    String pattern = "dd/MM/yyyy";
    SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
    
    private Integer id;
    
    private String name;
    
    private String lastNameFather;
    
    private String lastNameMother;
    
    private LocalDate birthdate;

    public Employee(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return id;
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

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Employee{" +  "id=" + id 
                + ", name=" + name 
                + ", lastNameFather=" + lastNameFather 
                + ", lastNameMother=" + lastNameMother 
                + ", birthdate=" + dateFormat.format(birthdate)  + '}';
    }
    
    
}
