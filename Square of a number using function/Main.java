import java.util.Scanner;
class Main
{
   void square(int n)
  {
    System.out.println(n*n);
   
  } 
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner s = new Scanner(System.in);
      Main ab = new Main();
      int n = s.nextInt();
      ab.square(n);
      
	} 

}