import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.ManagedProperty;
import javax.inject.Inject;
@Named("manager")
@RequestScoped

public class ManagerBean {

    private String version = "1.0-SNAPSHOT";

    private Student students[] = 
    new Student[] { 
        new Student(0, "JEAN", "Pierre", "14/05/1986", "0696452100" ),
        new Student(1,"MARINE", "Aude", "15/02/2002","0696154700")
        };

    @Inject @ManagedProperty(value ="#{id}")
    private int id;

    public String getVersion() {

        return version;
    }

    public Student[] getStudentList(){
        
        return asList(students);
    }
    public int getParam() {
        return this.id;
    }
    private Student[] asList(Student[] students2) {
        return students2;
    }
    
    

}