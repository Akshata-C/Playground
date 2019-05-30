import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int ld=n%10;
    int fd=0;
    while(n!=0)
    {
      n=n/10;
      if(n<=9)
      {
        fd+=n;
      }
    }
    System.out.println(fd+ld);
  }
}