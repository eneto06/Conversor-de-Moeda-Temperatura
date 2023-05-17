package conversor.ConversorTemperatura;

public class ConversorKelvin implements ConversorTemperatura {

    @Override
    public double ConverterParaCelsius(double value) {
        return value - 273.15;
    }

    @Override
    public double converterDeCelsius(double value) {
        return value + 273.15;
    }
    
}
