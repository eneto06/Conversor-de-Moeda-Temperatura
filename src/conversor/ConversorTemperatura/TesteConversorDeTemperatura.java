package conversor.ConversorTemperatura;

public class TesteConversorDeTemperatura {
    
    public static void main(String[] args) {
        
    

    ConversorTemperatura ConversorFahrenheit = new ConversorFahrenheit();
    ConversorTemperatura ConversorKelvin = new ConversorKelvin();

    double temperaturaEmCelsius = 25.0;
    double temperaturaEmFahrenheit = ConversorFahrenheit.converterDeCelsius(temperaturaEmCelsius);
    double temperaturaEmKelvin = ConversorKelvin.converterDeCelsius(temperaturaEmFahrenheit);

    System.out.println("Temperature in Celsius: " + temperaturaEmCelsius);
    System.out.println("Temperature in Fahrenheit: " + temperaturaEmFahrenheit);
    System.out.println("Temperature in Kelvin: " + temperaturaEmKelvin);

}

}
