package fundamentos.SpringBoot.fundamentos.Bean;

public class MyBeanImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("hola desde mi implementación propia del bean");
    }
}
