package WEEK13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Lab13a {


	public static void main(String[] args) {
		File file = new File("Pwd.txt");
		Scanner pf = null; // initialize scanner
		PrintWriter valid = null;
		PrintWriter invalid = null;
		String validStr = "validpwd.txt";
		String invalidStr = "invalidpwd.txt";
		String passwd = "";
		boolean done = false;

		while (!done) {
			try {
				pf = new Scanner(file);
			} catch (Exception e) {
				System.out.println("Error. We cannot find this file.");
				break;
			} 
			try {
				valid = new PrintWriter(validStr);
			} catch (FileNotFoundException e) {
				System.out.println("Error! Unable to create: " + validStr);
			}
			try {
				invalid = new PrintWriter(invalidStr);
			} catch (FileNotFoundException e) {
				System.out.println("Error! Unable to create: " + invalidStr);
			}
			while (pf.hasNext()) {
				passwd = pf.nextLine();
				if (!(passwd.length() >= 8)) {
					invalid.printf("%-15s Invalid Password! Must be at least 8 characters long.%n", passwd);
				} else if (!hasUpper(passwd)) {
					invalid.printf("%-15s Invalid Password! Must contain at least one UPPERCASE character.%n", passwd);
				} else if (!hasLower(passwd)) {
					invalid.printf("%-15s Invalid Password! Must contain at least one LOWERCASE character.%n", passwd);
				} else if (!hasNumber(passwd)) {
					invalid.printf("%-15s Invalid Password! Must contain at least one NUMBER.%n", passwd);
				} else if (!hasSpecial(passwd)) {
					invalid.printf("%-15s Invalid Password! Must contain at least one of {@,#,%s,-,&,*}.%n", passwd, "%");
				}else {
					valid.printf("%s%n", passwd);
				}
			}
			invalid.close();
			valid.close();
			done = true;
		}
	}
	public static boolean hasUpper(String passwd) {
		for (int i = 0; i < passwd.length(); i++) {
			if (Character.isUpperCase(passwd.charAt(i))) {
				return true;
			}
		} 
		return false;
	}
	public static boolean hasLower(String passwd) {
		for (int i = 0; i < passwd.length(); i++) {
			if (Character.isLowerCase(passwd.charAt(i))) {
				return true;
			}
		} 
		return false;
	} 
	public static boolean hasNumber(String passwd) {
		for (int i = 0; i < passwd.length(); i++) {
			if (Character.isDigit(passwd.charAt(i))) {
				return true;
			}
		}
		return false;
	} 
	public static boolean hasSpecial(String passwd) {
		String special = "@#%-&*";
		for (int i = 0; i < passwd.length(); i++) {
			for (int j = 0; j < special.length(); j++) {
				if (passwd.charAt(i) == special.charAt(j)) {
					return true;
				}
			} 
		} 
		return false;
	}
}
