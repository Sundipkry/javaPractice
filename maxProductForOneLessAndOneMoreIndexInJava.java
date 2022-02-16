import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<n; i++){
		    
		    arr[i]=sc.nextInt();
		}
		
		int maxProduct=1;
		int num=-1;
		
		if(n>2){
		    
		    for(int i=0; i<n; i++){
		        
		        int product=1;
		        if(i==0){
		            
		            product=arr[n-1]*arr[i+1];
		        }
		        else if(i==n-1){
		            
		            product=arr[i-1]*arr[0];
		        }
		        else{
		            
		            product=arr[i-1]*arr[i+1];
		        }
		        
		        if(product>maxProduct){
		            
		            maxProduct=product;
		            num=arr[i];
		        }
		    }
		}
		System.out.println(num);
	}
}
