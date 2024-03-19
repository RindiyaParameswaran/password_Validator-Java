package project;
import java.util.*;
public class password_validation {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Please Enter your password:");
	String s=sc.nextLine();
	int caps=0;
	int small=0;
	int nums=0;
	int sp_char=0;
	if(s.length()<8)
		System.out.print("your Password must have atleast 8 characters");
	else if(s.length()>=8) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(0)>='A'&&s.charAt(0)<='Z') {
				caps++;}
			else {
				System.out.print("First letter must have uppercase");
			break;
			}
				if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
				caps++;
				else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
					small++;
				else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
					nums++;
				else
					sp_char++;
		}
		if(caps>=1&&small>=1&&sp_char>=1) {
			System.out.println("--------Good----------");
			System.out.println("Strong Passowrd");
			System.out.println("Your Password is valid");
			System.out.println("Password Accepted");
		}
		else {
			System.out.println("--------OOps----------");
			System.out.println("Your Passowrd is not valid");
			System.out.println("Your Password shouls contain minimum");
			System.out.println("****1-Uppercase****");
			System.out.println("****1-Lowercase****");
			System.out.println("****1-number****");
			System.out.println("****1-Special Character****");
		}
	}
}
}
