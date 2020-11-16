import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named("manager")
@RequestScoped


public class ManagerBean {

    private String version = "1.0-SNAPSHOT";

    public String getVersion() {

        return version;
    }
    public void setVersion(String version){
        
        this.version = version;
    }
    
}

      

 