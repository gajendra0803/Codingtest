package CTest;
import java.util.*;
public class Pallindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String to check it is Pallindrome or not: ");
		String str = sc.nextLine();
		int i=0;
		int j = str.length()-1;
		boolean flag =true;
		
		while(i<j && flag == true ) {
			if(str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			}
			i++;
			j--;
		}
		
		if(flag) {
			System.out.println("String is Pallindrome");
		}
		else {
			System.out.println("Its not a pallindrome");
		}
	}

}
