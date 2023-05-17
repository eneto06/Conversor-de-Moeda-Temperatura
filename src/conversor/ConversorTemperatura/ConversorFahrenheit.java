package conversor.ConversorTemperatura;

public class ConversorFahrenheit implements ConversorTemperatura {

    @Override
    public double converterDeCelsius(double value) {
        return (value - 32) / 1.8;
    }

    @Override
    public double ConverterParaCelsius(double value) {
        return (value * 1.8) + 32;
    }
    
}