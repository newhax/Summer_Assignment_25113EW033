import java.util.Scanner;
public class question43
{
    int num;
     void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        
     }
     void putdata()
     {
        int count=0;
       for(int i=1;i<=num;i++){
         if(num%i==0){
            count++;
         }
        }
         if(count==2){
            System.out.println("PRIME");
         }else{
            System.out.println("NOT PRIME");
         
       }
    
     }
     public static void main(String[] args)
     {
question43 aa=new question43();
        aa.getdata();
        aa.putdata();
        
        
     }
    }
