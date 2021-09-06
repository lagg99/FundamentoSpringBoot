package fundamentos.SpringBoot.fundamentos.Bean;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class MyBeanWithdepencyImplement implements MyBeanWithDependency{

    private MyOperation myOperation;

    Log LOGGER= LogFactory.getLog(MyBeanWithdepencyImplement.class);
    public MyBeanWithdepencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithdependency() {

        LOGGER.info("Hemos ingresado al método printWithdependency");
        int numero=91;
        LOGGER.debug("El numero enviado por parámetro es "+numero);
        System.out.println(myOperation.suma(numero));
        System.out.println("Hola desde la implementación de un bean con dependencia");
    }
}
