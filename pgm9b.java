import java.util.Scanner;
 
class pgm9b{
   public static void main(String args[])
   {
      int n, i, j;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter the number of rows of floyd's triangle you want");
      n = in.nextInt();
 
      System.out.println("Floyd's triangle :-");
 
      for ( i = 1 ; i <= n ; i++ )
      {
         for ( j = 1 ; j <= i ; j++ )
         {
            System.out.print(((i+j)%2)+" ");
         }
 
         System.out.println();
      }
   }
}
