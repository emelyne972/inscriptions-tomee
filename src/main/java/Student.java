  
//import java.util.Arrays;
import javax.inject.Named;
//import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
@Named("student")
@RequestScoped


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
        this.id = id;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }  
    public void setBirthdate(String birthdate){
        this.birthdate = birthdate;
    }  
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public Student(){
        this.id = 0;
        this.lastName = "JEAN";
        this.firstName = "Robert";
        this.birthdate = "14/02/2008";
        this.phoneNumber = "0696145200";
    }
    public Student(int id, String lastName, String firstName, String birthdate, String phoneNumber){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
    }
    
}