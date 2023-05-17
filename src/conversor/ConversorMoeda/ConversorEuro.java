package conversor.ConversorMoeda;

public class ConversorEuro implements ConversorMoeda {

    @Override
    public double ConverterDeReal(double value) {
        return value * 5.5;
    }

    @Override
    public double converterParaReal(double value) {
        return value * 0.19;
    }


    
    
}
