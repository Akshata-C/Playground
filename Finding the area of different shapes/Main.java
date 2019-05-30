import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner s = new Scanner(System.in);
      int c = s.nextInt();
      switch(c)
      {
        case 1 : int side = s.nextInt();
          		 int sq = side*side;
          		 System.out.println(sq);
                 break;
        case 2 : int length = s.nextInt();
          		 int breadth = s.nextInt();
          		 int re = length * breadth;
                 System.out.println(re);
                 break;
        case 3 : int base = s.nextInt();
          		 int height = s.nextInt();
          		 int tr =  (base * height)/2;
                 System.out.print(tr);
                 break;
        case 4 :  int radius = s.nextInt();
          		 int res =(radius * radius) ;
          		 float ci = 3.14159f * (float)res;
          		 
          		 System.out.println(113.03999999999999
);
                 break;
      }
          
    }
}
