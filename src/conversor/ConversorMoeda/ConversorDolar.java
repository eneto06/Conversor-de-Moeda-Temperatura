package conversor.ConversorMoeda;

public class ConversorDolar implements ConversorMoeda{




    @Override
    public double ConverterDeReal(double value) {
        return value * 4.9;
    }


    @Override
    public double converterParaReal(double value) {
        return value * 0.20;
    }


   

    


    

   


    
}
