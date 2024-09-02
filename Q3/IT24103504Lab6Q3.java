import java.util.Scanner;
 public class IT24103504Lab6Q3{
 public static void main(String []args){

 Scanner input=new Scanner(System.in);

 int count=0;
 int number=0;
 double powersqr=0;
 double rootsqr=0;

 System.out.println("Enter positive integers(terminate input with -99): ");

 while(true)
{
 System.out.print("Enter a number"+ ":");
 number=input.nextInt();
   
  if(number==-99)
    {
     break;
     }
  if(number<0)
   {
    System.out.println("please enter a positive integer or -99:");
    continue;
   }
      powersqr+=Math.pow(number, 2); 
      count++;
}
  if(count>0)
  {
   rootsqr=Math.sqrt(powersqr/count);
   System.out.print("The Root Mean Square(RMS) is: "+rootsqr);
  }


}
}


