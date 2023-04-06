
import javax.swing.JOptionPane;

public class MenuConversor  {

    static String valorInseridoParaMoeda;
    static String valorInseridoParaTemperatura;
  
  
   public static void main(String[] args) {

      
      Object [] tipoDeConversao = {"Conversor de moeda", "Conversor de temperatura"};
      String validacao = (String) JOptionPane.showInputDialog(null,
            "Selecione uma opção: \n", "Menu", JOptionPane.PLAIN_MESSAGE, null, tipoDeConversao, tipoDeConversao[0]);
         

         if ( validacao == null) {
            JOptionPane.showMessageDialog(null, "Você pressionou cancel");
         }

          if (validacao == "Conversor de moeda") {
              
            valorInseridoParaMoeda = JOptionPane.showInputDialog(null, "Insira aqui o valor em reais que deseja converter: ");
            double valorReal = Double.parseDouble(valorInseridoParaMoeda);
            Object [] conversoresMoeda = {"Real a euro", "Real a dolar", "Real a peso argentino", "Real a peso chileno"};
            String opcaoMoeda = (String) JOptionPane.showInputDialog(null,
                   "Selecione uma opção: \n", "Conversor de moeda", JOptionPane.PLAIN_MESSAGE, null, conversoresMoeda, conversoresMoeda[0]);
      
                   if (opcaoMoeda == conversoresMoeda[0]) {
                         
                         final double euro = 5.5;                       
                         double valorConvertido = valorReal / euro;
                         JOptionPane.showMessageDialog(null, "O valor convertido em euro é: " + valorConvertido);
      
                   }
      
                   if (opcaoMoeda == conversoresMoeda[1]) {
      
                        final double dolar = 5.09;                     
                        double valorConvertido = valorReal / dolar;
                        JOptionPane.showMessageDialog(null, "O valor convertido em dolar é: " + valorConvertido);
      
                   }
      
                   if (opcaoMoeda == conversoresMoeda[2]) {
      
                        final double pesoArgentino = 0.024;                       
                        double valorConvertido = valorReal / pesoArgentino;
                        JOptionPane.showMessageDialog(null, "O valor convertido em peso argentino é: " + valorConvertido);
                   }
      
                   if (opcaoMoeda == conversoresMoeda[3]) {
      
                        final double pesoChileno = 0.0064;
                        double valorConvertido = valorReal / pesoChileno;
                        JOptionPane.showMessageDialog(null, "O valor convertido em peso chileno é:  " + valorConvertido);
                   }
                  
         }


                   if (validacao == "Conversor de temperatura") {

                         valorInseridoParaTemperatura = JOptionPane.showInputDialog(null, "Insira aqui o valor em celsius que deseja converter: ");
                        double conversaoValorInserido = Double.parseDouble(valorInseridoParaTemperatura);
                        Object [] conversoresTemperatura = {"Celsius para Fahrenheit", "Celsius para Kelvin"};
                        String opcaoTemperatura = (String) JOptionPane.showInputDialog(null,
                           "Selecione uma opção: \n", "Conversor de temperatura", JOptionPane.PLAIN_MESSAGE, null, conversoresTemperatura, conversoresTemperatura[0]);
                     

                        if (opcaoTemperatura == "Celsius para Fahrenheit") {
                           
                           double fahrenheit = (conversaoValorInserido*1.8) + 32;
                           JOptionPane.showMessageDialog(null, "O valor em celsius convertido para Fahrenheit é: " + fahrenheit);
                        }

                        if (opcaoTemperatura == "Celsius para Kelvin") {

                           double kelvin = conversaoValorInserido + 273;
                           JOptionPane.showMessageDialog(null, "O valor em Celsius convertido para Kelvin é: " + kelvin);

                        }
         }

       
    
     

   
        
   }

}