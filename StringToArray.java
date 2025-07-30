package Test;

public class StringToArray {

	public static void main(String[] args) {
		String str="0110001111";
		int arr[]=new int[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i)-'0';
			System.out.print(arr[i]);

		}

		

	}

}
