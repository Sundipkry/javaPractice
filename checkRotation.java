import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.nextLine();
		String ans="";
		String s2=sc.nextLine();
		int n=s1.length();
		char[] arr=new char[n];
		for(int i=0; i<n; i++){
		    
		    arr[i]=s1.charAt(i);
		}
		
		if(n!=s2.length()){
		    
		    ans="No";
		}
		else{
		    
		    for(int j=0; j<n; j++){
		        
		        String s="";
		        char temp=arr[0];
		        for(int i=0; i<n; i++){
		            
		            if(i!=n-1){
		                
		                arr[i]=arr[i+1];
		            }
		            else{
		                    
		                arr[i]=temp;
		            }
		        }
		        
		        for(int i=0; i<n; i++){
		            
		            s=s+arr[i];
		        }
		        if(s.equals(s2)){
		            
		            ans="Yes";
		            break;
		        }
		        else{
		            
		            ans="No";
		        }
		    }
		}
		System.out.println(ans);
	}
}
