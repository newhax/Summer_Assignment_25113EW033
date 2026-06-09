import java.util.Scanner;
public class question36{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         int i,j,n;char ch='A';
         System.out.println("ENTER THE NO OF ROWS IN PATTERN:");
         n=sc.nextInt();
         for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(ch);
                
                
            }
            ch++;
            
            
            System.out.println("");
         }
         sc.close();
    }
}
