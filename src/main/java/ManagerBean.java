import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.util.ArrayList;
@Named("manager")
@RequestScoped


public class ManagerBean {

    private String version = "1.0-SNAPSHOT";

    private ArrayList<Student> students ;

    public String getVersion() {

        return version;
    }

    public ArrayList<Student> getStudentList(){
        
        return students;
    }

    


}
      

 