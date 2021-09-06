package fundamentos.SpringBoot.fundamentos.Bean;

import org.springframework.stereotype.Component;

public class myBeanWithPropertiesImplement implements  myBeanWithProperties{

    private String nombre;
    private String apellido;

    public myBeanWithPropertiesImplement(String name, String apellido){

        this.apellido=apellido;
        this.nombre=name;
    }


    @Override
    public String function() {
        return nombre+" "+apellido;
    }
}
