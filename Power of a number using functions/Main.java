import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int base = s.nextInt();
    int exponent = s.nextInt();
     power(base , exponent);
    
  }
  public static void power(int base,int exponent)
  {
   int res=1;
    while(exponent>=1)
    {
     res = res * base;
    exponent--;
    }
    System.out.println(res);
  }
}