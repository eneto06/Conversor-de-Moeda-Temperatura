package conversor.ConversorMoeda;

public class ConversorPesoArgentino implements ConversorMoeda {

    @Override
    public double ConverterDeReal(double value) {
        return value * 46.77;
    }

    @Override
    public double converterParaReal(double value) {
        return value * 1.0;
    }

   

    
    
}
