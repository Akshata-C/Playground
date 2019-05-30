import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      for(int i=n;i>=1;i--)
      {
       int num=i;
        for(int j=1;j<=n;j++)
        {
            if(num>0)
          System.out.print(num);
        
          num--;
        }
        System.out.print("\n");
      }
	}
}
