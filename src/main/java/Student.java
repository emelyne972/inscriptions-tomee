import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ManagerBean;


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
    public ArrayList<Student> getStudentList(){

        System.println(this.id, this.lastname, this.firstname, this.datebirth, this.phoneNumber);
    }

    public List<Student> setStudentList = Arrays.asList; {

        new Student (0, "Dupont","pierre","14/01/1996","06 96 00 00 00");
        new Student (1, "DuBois","fred","01/01/1996","06 96 00 00 00");
        
    }

}



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