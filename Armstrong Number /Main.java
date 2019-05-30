import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int temp=n,digits=0;
    int rem,sum=0;
    
      while(temp!=0)
      {
        digits++;
        temp=temp/10;
      }
    temp=n;
    while(temp!=0)
    {
      rem=temp%10;
      sum=sum+power(rem,digits);
      temp=temp/10;
    }
      
    
    if(n==sum)
      System.out.println("Armstrong Number");
    else
      System.out.println("Not a Armstrong Number");
   }
  
  static int power(int n,int r)
  {
    int c,p=1;
    for(c=1;c<=r;c++)
    {
      p=p*n;
    }
    return p;
  }
}