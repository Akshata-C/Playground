import java.util.Scanner;
class Main{
int sum(int n)
  {
    
   System.out.println (n*(n+1)/2);
  return 0;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      Main ab = new Main();
      int n = s.nextInt();
     
      ab.sum(n);
      
	}
}