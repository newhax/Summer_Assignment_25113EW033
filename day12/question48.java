import java.util.Scanner;
public class question48{
    int num;
     void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        
     }
     void putdata(){
        int i,sum=0;
        for(i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(num==sum){
            System.out.println("perfect number:");
        }else{
            System.out.println("Not perfect number:");
        }
    }
     
     public static void main(String[] args)
     {
question48 aa=new question48();
        aa.getdata();
        aa.putdata();
        
        
     }
    }

