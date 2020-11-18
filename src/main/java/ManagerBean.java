import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
@Named("manager")
@RequestScoped


public class ManagerBean {

    private String version = "1.0-SNAPSHOT";

    private Student students[] = new Student[] { new Student(0, "JEAN", "Pierre", "14/05/1986", "0696452100" )};

    public String getVersion() {

        return version;
    }

    public Student[] getStudentList(){
        
        return students;
    }

    


}