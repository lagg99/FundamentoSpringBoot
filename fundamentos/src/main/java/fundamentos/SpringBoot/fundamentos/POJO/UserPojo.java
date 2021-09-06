package fundamentos.SpringBoot.fundamentos.POJO;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding //Para que se construya este POJO
@ConfigurationProperties(prefix = "user")//este prefijo es el que representa al user del archivo application.properties
public class UserPojo {
    private String email;
    private String password;
    private int age;
    public UserPojo(String email, String password, int age){
        this.age=age;
        this.password=password;
        this.email=email;
    }
    public void setEmail(String user){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
