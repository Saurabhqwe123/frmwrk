package Test;

import java.util.Arrays;

public class ArrayP {

	public static void main(String[] args) {
		String str="saurabh";
		char temp=0;
		char arr[]=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<arr.length;) {
				
					if(arr[i]==arr[j]) {
						System.out.println("not valid");
					}
					else {
						arr[i]=arr[j];
		

}
}
		}
	}
}