import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
		    
		    arr[i]=sc.nextInt();
		}
		
		int[] newArr= new int[n];
		int[] subArr= new int[n];
		int sum=0;
		int l=0;
		
		for(int i=0; i<n; i++){
		    
		    int newSum=0;
		    int k=0;
		    for(int j=i; j<n; j++){
		        
		        if(arr[j]>0){
		            
		            subArr[k]=arr[j];
		            k++;
		            newSum=newSum+arr[j];
		        }
		        else{
		            
		            break;
		        }
		    }
		    
		    if(newSum>=sum){
		        
		        for(int j=0; j<k; j++){
		            
		            newArr[j]=subArr[j];
		        }
		        sum=newSum;
		        l=k;
		    }
		}
		
		for(int i=0; i<l; i++){
		    
		    System.out.print(newArr[i]+" ");
		}
	}
}
