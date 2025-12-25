import java.util.Scanner; 
public class Factorial 
{ 
 public static int calculateFactorial(int n) 
 { 
  if(n==0||n==1) 
  { 
   return 1; 
  } 
  return n*calculateFactorial(n-1); 
 } 
 public static void main(String[]args) 
 { 
  Scanner scanner=new Scanner(System.in); 
  System.out.println("Enter a number to calculate it's factorial:");
   int number=scanner.nextInt(); 
  int factorial=calculateFactorial(number); 
  System.out.println("The factorial of "+number+" is:"+factorial); 
 } 
} 