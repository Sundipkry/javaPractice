import java.util.*;
import java.math.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        
        int q=sc.nextInt();
        int[] a=new int[q];
        int[] b=new int[q];
        int[] n=new int[q];
        
        for(int i=0; i<q; i++){
            
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            n[i]=sc.nextInt();
        }
        
        for(int i=0; i<q; i++){
            
            for(int j=0; j<n[i]; j++){
        
                int sum=a[i];
                for(int k=0; k<=j; k++){
                    
                    sum=sum+(int)Math.round((Math.pow(2,k)*b[i]));
                }
                System.out.print(sum+" ");
            }
            System.out.println("");
        }
	}
}
