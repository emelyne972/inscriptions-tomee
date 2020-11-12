@javax.faces.bean.ManagedBean
@Named("manager")
@RequestScoped

public class ManagerBean {

    private String version = "1.0-SNAPSHOT";

    public String getVersion() {
        return version;
    }
    
    
}

      

 