import java.util.Scanner;

public class Return_Statement {
  double divide(int a, int b)// called method
  {
    if (b == 0) {
      return 0;
    }
    double c = (double) a / b;
    return c;
  }

  public static void main(String args[]) // calling method
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter 2 numbers");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    Return_Statement d = new Return_Statement();
    double div = d.divide(num1, num2);
    System.out.println("Division result is " + div);
  }
}

// class Demo
// {
// String divide(int a,int b)//called method
// {
// if(b==0)
// {
// return "0";
// }
// double c=(double)a/b;
// 2.5 String cc=Double.toString(c);
// "2.5" return cc;
// }
// public static void main(String args[])
// {

// Scanner sc=new Scanner(System.in);
// System.out.println("Please enter 2 numbers");
// int num1=sc.nextInt();
// int num2=sc.nextInt();
// Demo d=new Demo();
// String div=d.divide(num1,num2);
// System.out.println("Division result is "+div);
// }}}
