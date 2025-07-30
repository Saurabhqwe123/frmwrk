package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1=sc.nextLine();
		String str2 = sc.nextLine();
		char[]arr1=str1.toCharArray();
		char[]arr2=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr2,arr1)) {
			System.out.println("word is anagram");
		}
		else
		{
			System.out.println("Word is not anagram");
		}

	}

}
