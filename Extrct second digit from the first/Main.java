import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    while(n>99)
    {
      n=n/10;
    }
    n=n%10;
    System.out.println(n);
  }
}