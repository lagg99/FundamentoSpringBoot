package fundamentos.SpringBoot.fundamentos.Bean;

public class MyOperationImplement implements MyOperation{
    @Override
    public int suma(int number) {
        return number+1;
    }
}
