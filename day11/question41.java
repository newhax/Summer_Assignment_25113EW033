import java.util.Scanner;
public class question41
{
    int num1,num2;
     void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
     }
     void putdata()
     {
       int sum;
       sum=num1+num2;
       System.out.println("Sum of two numbers is:"+sum);
     }
     public static void main(String[] args)
     {
        question41 aa=new question41();
        aa.getdata();
        aa.putdata();
        
        
     }
    }