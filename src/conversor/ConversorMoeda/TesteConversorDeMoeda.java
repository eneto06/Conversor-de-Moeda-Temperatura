package conversor.ConversorMoeda;

public class TesteConversorDeMoeda {
    
    public static void main(String[] args) {
        
        ConversorMoeda ConversorDolar = new ConversorDolar();
        ConversorMoeda ConversorEuro = new ConversorEuro();
        ConversorMoeda ConversorPesoArgentino = new ConversorPesoArgentino();
    
        double valorEmDolar = ConversorDolar.ConverterDeReal(50);
        double valorEmEuro = ConversorEuro.ConverterDeReal(700.4);
        double valorEmPesoArgentino = ConversorPesoArgentino.ConverterDeReal(12.2);
       
    
        System.out.println("Valor em Dolar: " + valorEmDolar);
        System.out.println("Valor em Euro: " + valorEmEuro);
        System.out.println("Valor em Peso Argentino: " + valorEmPesoArgentino);
        




    }

   
}
