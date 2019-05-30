import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n1 = s.nextInt();
      int n2 = s.nextInt();
      int n3 = s.nextInt();
      int res = great(n1,n2,n3);
      System.out.println(res);
    }
  public static int great(int n1,int n2,int n3)
  {
    if(n1>n2 && n1>n3)
      return n1;
    else if(n2>n1 && n2>n3)
      return n2;
    else
      return n3;
  }
}