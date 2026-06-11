import java.util.Scanner;
public class question44
{
    int num;
     void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        
     }
     void putdata()
     {
        int fact=1;
       for(int i=1;i<=num;i++){
         fact=fact*i;
       }
       System.out.println("Factorial of the entered number is:"+fact);
    
    
     }
     public static void main(String[] args)
     {
question44 aa=new question44();
        aa.getdata();
        aa.putdata();
        
        
     }
    }
