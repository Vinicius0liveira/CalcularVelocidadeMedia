 public class CalcularVelocidadeMedia {
   
        public static void main(String[] args){
        System.out.println("=== CALCULO DA VELOCIDADE MEDIA ===");
      // QUALQUER VALOR PODE SER INSERIDO ABAIXO, DESDE QUE SEJA RESPEITADO AS REGRAS DE PONTUAÇÃO.
       
         double distanciaPercorrida = 10;
         System.out.println("A distancia percorrida foi de " + distanciaPercorrida + "Km."); 

         double tempoGasto = 0.2;
         System.out.println("O tempo gasto foi de "+ tempoGasto + " horas.");

         double velocidadeMedia = distanciaPercorrida / tempoGasto;
         System.out.println("Para encontrar a velocidade media " + "dividimos a distancia (" + distanciaPercorrida + ") pelo tempo gasto no "+ "percurso (" + tempoGasto + ").");

         System.out.println("A velocidade media e de " + velocidadeMedia + "Km/h");
    }
 }