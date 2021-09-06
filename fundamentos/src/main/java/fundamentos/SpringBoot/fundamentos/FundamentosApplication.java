package fundamentos.SpringBoot.fundamentos;

import fundamentos.SpringBoot.fundamentos.Bean.MyBean;
import fundamentos.SpringBoot.fundamentos.Bean.MyBeanWithDependency;
import fundamentos.SpringBoot.fundamentos.Bean.myBeanWithProperties;
import fundamentos.SpringBoot.fundamentos.Component.ComponentDependency;
import fundamentos.SpringBoot.fundamentos.Component.ComponentImplement;
import fundamentos.SpringBoot.fundamentos.POJO.UserPojo;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {//implementar CommandLineRunner
	//este implemets permite ejecutar los métodos en su método public void run...

	private final Log LOGGER= LogFactory.getLog(FundamentosApplication.class);

	//Objeto que vamos a inyectar es la interfaz
	private ComponentDependency componentdependency;// dependencia
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;
	private myBeanWithProperties myBeanWithProperties;
	private UserPojo userPojo;

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
								  MyBean myBean, MyBeanWithDependency myBeanWithDependency,
								  myBeanWithProperties myBeanWithProperties, UserPojo userPojo){//inyección por el constructor
		/*@Qualifier("componentTwoImplement") se utiliza para indicar que dependencia se va a inyectar*/
		this.componentdependency=componentDependency;
		this.myBean= myBean;
		this.myBeanWithDependency=myBeanWithDependency;
		this.myBeanWithProperties=myBeanWithProperties;
		this.userPojo=userPojo;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) {
		componentdependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithdependency();
		System.out.println(myBeanWithProperties.function());
		System.out.println("Email: "+userPojo.getEmail()+" Contraseña: "+userPojo.getPassword()+" Edad: "+userPojo.getAge());
		LOGGER.error("Esto es un error del aplicativo");
	}
}