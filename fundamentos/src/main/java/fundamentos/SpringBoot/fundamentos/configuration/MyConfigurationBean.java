package fundamentos.SpringBoot.fundamentos.configuration;

import fundamentos.SpringBoot.fundamentos.Bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public MyBean beanoperation(){
        //esta clase se utiliza par definir que independencia queremos inyectar
        return new MyBean2Implement();
        //return new MyBeanImplement();
    }
    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplement();
    }
    @Bean
    public MyBeanWithDependency beanOperationWihtDependency(MyOperation myOperation){
        return new MyBeanWithdepencyImplement(myOperation);
    }
}
