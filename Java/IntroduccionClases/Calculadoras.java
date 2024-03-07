package calculadoras;

public class Calculadoras {
        double x;
        double y;
        static double r;

        public Calculadoras(double a,double b) {
          x = a;
          y = b;
          r = 0;
        }
    
      public double suma (double a ,double b) {
           x = a;
           y = b;
           r = x + y;
           return r;
        }

        public double  restar(double a, double b) {
           x = a;
           y = b;
           r = x - y;
           return  r;
      }

      public double multiplicar (double a, double b) {
        x = a;
        y = b;
        r = x * y;
        return  r;    
      }

      public double dividir (double a, double b) {
        x = a;
        y = b;
        r = (float) x / (float)  y;
        return r;
      }
      public double pow1 (double a) {
        x = a;
        r = x * x;
        return r;
      }
      public double pow2 (double b) {
        y = b;
        r = y * y;
        return r;
      }
      public double pow (double a, double b) {
        x = a;
        y = b;
        r = (x * x) + (y * y);
        return r;
      }
  
      public static void imprimirResultado() {
         System.out.println(" = " + r);
      }
      
      public static void main(String[] args) {
          
          Calculadoras micalculadora = new Calculadoras (0,0);
         
           micalculadora.suma(8.8 ,10.9);
           micalculadora.imprimirResultado();
          
           micalculadora.restar(80,19);
           micalculadora.imprimirResultado();
          
           micalculadora.multiplicar(9,85);
           micalculadora.imprimirResultado();
          
           micalculadora.dividir(8.9,15.3);
           micalculadora.imprimirResultado();
          
           micalculadora.pow1(8);
           micalculadora.imprimirResultado();
          
           micalculadora.pow2(150);
           micalculadora.imprimirResultado();
          
           micalculadora.pow(8, 15);
           micalculadora.imprimirResultado();
          
          } 
        
         }
