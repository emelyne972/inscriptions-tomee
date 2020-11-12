import javax.persistence.Id;

public class Student{

    public int id;
    public String lastname;
    public String firstname;
    public String datebirth;
    public int phoneNumber;

public ArrayList<Student> getStudentList(){

public List<Student> getStudentList= Arrays.asList(

    new Student [ id , lastname , firstname , datebirth , phoneNumber ] {
    new Student (0, "Dupont","pierre","14/01/1996","06 96 00 00 00"),
    new Student (1, "DuBois","fred","01/01/1996","06 96 00 00 00")
    }
);
}
}  