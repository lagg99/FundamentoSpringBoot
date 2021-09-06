package fundamentos.SpringBoot.fundamentos.Component;

import org.springframework.stereotype.Component;

@Component
    public class ComponentTwoImplement implements ComponentDependency{
        /*Como se implementa este segundo componente, se acarrea el error por
        cuestión de que se está tomando en "FundamentosApplication" se está inyectando
        la interfaz "ComponentDependency" que esta a su vez se están implementando en dos clases*/
    @Override
    public void saludar() {
        System.out.println("Hola desde mi componente dos");
    }
}
