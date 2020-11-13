import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
public class Student{

    private int id;
    private String lastname;
    private String firstname;
    private String datebirth;
    private String phoneNumber; 

    public Student(int id, String lastname, String firstname, String datebirth, String phoneNumber) {

        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.datebirth = datebirth;
        this.phoneNumber = phoneNumber;
    }
    public String getStudentList(){

        System.println(this.id, this.lastname, this.firstname, this.datebirth, this.phoneNumber);
    }

    public void setStudentList(){

        new Student (0, "Dupont","pierre","14/01/1996","06 96 00 00 00");
        new Student (1, "DuBois","fred","01/01/1996","06 96 00 00 00");
        
    }

}
*/

public class Student{

    private int id;
    private String lastName;
    private String firstName;
    private String birthdate;
    private String phoneNumber; 

    public int getId(){
        return id;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getBirthdate(){
        return birthdate;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setId(int id){
        this.id = 0;
    }
    public void setLastName(String lastName){
        this.lastName = "JEAN";
    }
    public void setFirstName(String firstName){
        this.firstName = "Robert";
    }
    public void setBirthdate(String birthdate){
        this.birthdate = "14/02/2003";
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = "0696784521";
    }
}



