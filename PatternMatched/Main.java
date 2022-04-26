import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter a text string T: ");
		String textString=sc.next();
		System.out.print("Enter a pattern string P: ");
		String patternString=sc.next();
		// LOOP FOR textString
		for(int i=0;i<textString.length()-patternString.length();i++){
		    int j;
		    // check pattern matched or not if any char not matched break loop
		    for(j=0;j<patternString.length();j++){
		        if(textString.charAt(i+j)!=patternString.charAt(j)){
		            break;
		        }
		    }
		    // else if j==patternString.length() means pattern matched print
		    if(j==patternString.length()){
		        System.out.println(textString);
		        for(int k=0;k<i;k++){
		            // print space
		            System.out.print(" ");
		        }
		        System.out.println(patternString);
		        for(int k=0;k<i;k++){
		            // print space
		            System.out.print(" ");
		        }
		        System.out.println(i);
		    }
		    
		}
		
	}
}
