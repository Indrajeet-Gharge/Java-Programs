public class Calculator
 {
   public static void main(String args[])
   {
    System.out.println("i am in main");
    Calculator c=new Calculator();
    c.add();
    c.Sub();
    c.Mul();
    c.div();
    }

     public void add()
     {
      int a = 30;
      int b = 20;
      int c = a+b;
      System.out.println("Addition is = " +c);
     }

     public void Sub()
     {
      int a = 30;
      int b = 20;
      int d = a-b;
      System.out.println("Substraction is = " +d);
      }

      public void Mul()
      {
       int a = 30;
       int b = 20;
       int e = a*b;
       System.out.println("Multiplication is = " +e); 
       }  

      public void div()
      {
       int a = 30;
       int b = 20;
       int f = a/b;
       System.out.println("division is = " +f); 
       }

   }


  