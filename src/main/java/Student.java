import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student{

    public int id;
    public String lastname;
    public String firstname;
    public String datebirth;
    public int phoneNumber;

    public Student (int id, String lastname, String firstname, String datebirth, String phoneNumber) {
    
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.datebirth = datebirth;
        this.phoneNumber = phoneNumber;
        
    public ArrayList<Student> getStudentList(){
        
    public List<Student> getStudentList= Arrays.asList(
    new Student [] {
    new Student (0, "Dupont","pierre","14/01/1996","06 96 00 00 00"),
    new Student (1, "DuBois","fred","01/01/1996","06 96 00 00 00")
    }
);
}
}   
}