import java.util.Scanner;
public class IT24103504Lab6Q1{
  public static void main(String []args){

Scanner input=new Scanner(System.in);
double num;
double sqr;
double sqrt;

System.out.print("Enter a number: ");
num=input.nextDouble();

sqr=num*num;
sqrt=Math.sqrt(num);
System.out.println("The Square of " +num+  " is: "+sqr);

System.out.print("The sqare root of " +num+ " is: "+sqrt);
  }
}



