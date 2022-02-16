import java.util.*;

public class Main
{
    
    static int findValue(int a, int b){
        
        int maxSize=1;
        for(int i=1; i<=a; i++){
           
            if(a%i==0 && b%i==0){
                
                maxSize=i;
            }
        } 
        
        return maxSize;
    }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		    
		    int f1= sc.nextInt();
		    int f2= sc.nextInt();
		    
		    int maxSize=1;
		    if(f1>f2){
		        
		        maxSize=findValue(f2,f1);
		    }
		    else{
		        
		        maxSize=findValue(f1,f2);
		    }
		System.out.println(maxSize);
	}
}
