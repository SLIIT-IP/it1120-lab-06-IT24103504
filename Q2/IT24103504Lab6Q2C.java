import java.util.Scanner;
public class IT24103504Lab6Q2C{
  public static void main(String []args){

Scanner input=new Scanner(System.in);
int num;
int count;
String numbers="";
double sum=0;
double avg;

System.out.println("Please enter 10 numbers:");

for(count=0;count<10;count++)
{
  System.out.print("Enter number " + (count+1)+ ":" );
  num=input.nextInt();
  numbers += num+" ";
  sum+= num;
}
  avg=sum/10;

 System.out.println("you entered: " + numbers);
 System.out.println("The sum of the numbers is: "+sum);
 System.out.println("The average of numbers is: "+avg);
 
}
}