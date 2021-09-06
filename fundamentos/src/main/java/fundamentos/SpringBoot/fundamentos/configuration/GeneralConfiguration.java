package fundamentos.SpringBoot.fundamentos.configuration;

import fundamentos.SpringBoot.fundamentos.Bean.myBeanWithProperties;
import fundamentos.SpringBoot.fundamentos.Bean.myBeanWithPropertiesImplement;
import fundamentos.SpringBoot.fundamentos.POJO.UserPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableConfigurationProperties(UserPojo.class)//esto indica que la clase se va a representar como propiedades dentro de la aplicación
public class GeneralConfiguration {
    @Value("${value.name}")
    private String name;

    @Value("${value.apellido}")
    private String apellido;

    @Value("${value.random")
    private String random;

    @Bean
    public myBeanWithProperties funcion(){

        return new myBeanWithPropertiesImplement(name, apellido);
    }

}
