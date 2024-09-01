import java.util.Scanner;
public class IT24103504Lab6Q2B{
  public static void main(String []args){

Scanner input=new Scanner(System.in);
int num;
int count;
String numbers="";
System.out.println("Please enter 10 numbers:");

for(count=0;count<10;count++)
{
  System.out.print("Enter number"+(count+1)+ ":" );
  num=input.nextInt();
  numbers += num+" ";
}

 System.out.println("you entered: " + numbers);

}
}