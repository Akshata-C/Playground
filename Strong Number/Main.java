import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int temp=n;
    int rem,res=0,f=1;
    while(temp!=0)
    {
      rem=temp%10;
      res +=fact(rem);
      temp=temp/10;
    }
  
    if(n==res)
      System.out.println("Yes");
    else
      System.out.println("No");
    
   
  }
   static int fact(int r)
    {
     int fact=1;
      for(int i=1;i<=r;i++)
      {
        fact=i*fact;
      }
      return fact;
    }
}