@java.util.ArrayList
@javax.faces.bean.ManagedBean
@Named("manager")
@RequestScoped

public class ManagerBean {

    private String version = "1.0-SNAPSHOT";

    public String getVersion() {
        return version;
    }
    
    
}

    public class Student{

        public int id;
        public String lastname;
        public String firstname;
        public String datebirth;
        public String phoneNumber;

    public ArrayList<Student> getStudentList(){
    
    public List<Student> getStudentList = Arrays.asList(
        
    new Student[] {
        new Student (0, "Dupont","pierre","14/01/1996","06 96 00 00 00"),
        new Student (1, "DuBois","fred","01/01/1996","06 96 00 00 00")
    }  
    );
}
}    

 