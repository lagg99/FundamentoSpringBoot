package fundamentos.SpringBoot.fundamentos.Component;


import org.springframework.stereotype.Component;

@Component // con esta anotación definimos que este va ser un componente
public class ComponentImplement implements ComponentDependency {
    @Override
    public void saludar() {
        System.out.println("Hola mundo desde mi componente");
    }
}
