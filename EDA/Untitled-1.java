import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int t=s.nextInt();
	int j=0;
	int a[]=new int[n];
	for(int i=0;i<n;i++){
	    a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++){
	    if((a[i]+a[i+1])==t){
	        j=i+1;
	        System.out.print("["+i+j+"]");
	    }
	}
	}
}