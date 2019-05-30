import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code 2
      Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int i,count=0;
      if(count<=num)
      {
      for(i=1;i<=num*2;i++)
        if(i%2!=0)
          System.out.println(i);
        count++;
      }
	}
}