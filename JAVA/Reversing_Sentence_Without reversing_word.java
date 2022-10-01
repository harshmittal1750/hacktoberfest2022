import  java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str=sc.nextLine();
	    String[] s=str.split(" ");
	   
	    for(int i=s.length-1;i>=0;i--){
	        if(!s[i].isBlank())
	            System.out.print(s[i]+" ");
	    }
	  
	}
}
