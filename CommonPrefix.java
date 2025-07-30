package Test;

import java.util.Arrays;

public class CommonPrefix {

	public static void main(String[] args) {
		String arr[]= {"club","clup","cluture"};
		StringBuilder res=new StringBuilder();
		Arrays.sort(arr);
		char first[]=arr[0].toCharArray();
		char last[]=arr[arr.length-1].toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(first[i]==last[i]) {
				res.append(first[i]);
			}
		}
		System.out.println(res);

	}

}
