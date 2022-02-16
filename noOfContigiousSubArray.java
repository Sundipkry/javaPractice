import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		int s=sc.nextInt();
		
		int[] arr=new int[t];
		for (int i=0; i<t; i++){
		    
		    arr[i]=sc.nextInt();
		}
		int count=0;
		
		for(int i=0; i<t; i++){
		    
		    for(int j=i; j<t; j++){
		        
		        int product=1;
		        for(int k=i; k<=j; k++){
		            
		            product=product*arr[k];
		        }
		        if(product<s){
		            
		            count++;
		        }
		    }
		}
		System.out.println(count);
	}
}
