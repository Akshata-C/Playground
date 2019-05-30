
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner s = new Scanner(System.in);
      int base = s.nextInt();int res=1;
      int exponent = s.nextInt();
      for(int i=0;i<exponent;i++)
        res *=base;
      System.out.print(res);
    }
}
