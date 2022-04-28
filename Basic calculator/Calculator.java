/*
   Melvin Millayes
   28/04/2022
*/


import java.util.Scanner;
import java.lang.Math; 
//Este programa funciona como una calculadora basica
 
public class Calculator{
  public Calculator(){
  //Metodos para cada operacion aritmetiica
     }
     public int add(int a, int b){
        int sum = a + b;
        return sum;
     }
     
     public int substract(int a, int b){
      int difference = a - b;
      return difference;
      }
      public int multiply(int a, int b){
        int product = a * b;
        return product;
      
      }
      public int divide(int a, int b){
         int division = a / b;
         return division;
      }
      
      public int modulo(int a, int b){
         int remainder = a % b;
         return remainder;
      }
      public double root(double a){
       double squareRoot = Math.sqrt(a);
       return squareRoot;
      }
      public double power(double a, double b){
         double bpower = Math.pow(a,b);
         return bpower;
         }
      public static void main(String [] args){
      
        Calculator myCalculator = new Calculator();
        
        Scanner input =new Scanner(System.in);
     
        int opcion = 0;
    //Loop que permite que el usuario realice operaciones aritmeticas, sale del loop cuando el usuario presiona el 8.
          while(opcion != 8){
           System.out.println("Entre el numumero de lo que desea hacer \n1.Sumar \n2.Restar\n3.Multiplicar\n4.Dividir\n5.modulo\n6.Exponente\n7.Raiz Cuadrada\n8.Salir");
           opcion = input.nextInt();


            if(opcion == 1){
              System.out.println("Entre los dos valores que desea sumar."); 
              int a = input.nextInt();
              int b = input.nextInt();     
              System.out.println(myCalculator.add(a, b));
           
            }else if(opcion == 2){
               System.out.println("Entre los dos valores que desea restar."); 
              int a = input.nextInt();
              int b = input.nextInt();
              System.out.println(myCalculator.substract(a,b));
            }else if(opcion == 3){
              System.out.println("Entre los dos valores que desea multiplicar."); 
              int a = input.nextInt();
              int b = input.nextInt();
               System.out.println(myCalculator.multiply(a,b));
             
             }else if(opcion == 4) { 
                System.out.println("Entre los dos valores que desea dividir"); 
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println(myCalculator.divide(a,b));
      
             }else if(opcion == 5){
                System.out.println("Entre la division a los que desea encontrale el sobrante."); 
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println(myCalculator.modulo(a,b));}
              else if(opcion == 6){
                 System.out.println("Entre la base primero, luego el numero al cual lo desea elevar."); 
              int a = input.nextInt();
              int b = input.nextInt();
              System.out.println(myCalculator.power(a, b));
                }
              else if(opcion == 7){
               System.out.print("Entre el numero al cual desea sacarle la raiz cuadrada");
               double a = input.nextDouble();
               System.out.println(myCalculator.root(a));
               }    
              else{
      
                System.out.println("Entre una opcion valida");
         
             } 
     }

}
}