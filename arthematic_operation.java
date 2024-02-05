 class ArithmeticOperations {
      static void addition(float num1, float num2){
            System.out.print("Addition of given numbers = ");
            System.out.println(num1 + num2);
      }     

      static void subtraction(float num1, float num2){
            System.out.print("Subtraction of given numbers = ");
            System.out.println(num1 - num2);
      }     
      static void multiplication(float num1, float num2){
            System.out.print("Multiplication of given no.s = ");
            System.out.println(num1 * num2);
      }     
 
      static void division(float num1, float num2){
            System.out.print("Division of given given no.s = ");
            System.out.println(num1 / num2);
      }     
 
      
      static void moduloDivision(float num1, float num2){
            System.out.print("ModuloDivision of given no.s = ");
            System.out.println(num1 % num2);
      }
      public static void main(String args[]){
            addition(20, 10);
            subtraction(40, 30);
            multiplication(20, 30);
            division(20, 4);
            moduloDivision(20, 3);
      }
}