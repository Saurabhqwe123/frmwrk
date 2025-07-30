package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicate {

	public static void main(String[] args) {
		int arr[]= {2,5,6,2,6,8,9,8};
		int count=0;
	Arrays.sort(arr);
	List<Integer>li=new ArrayList<Integer>();
		for(int i=0;i<arr.length-1;i++) {
			li.add(arr[i]);
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
				i+=1;
				count++;
				
			}
			if(arr[i]==arr[i+1]) {
				li.remove(i);
				i+=1;
				System.out.print(li);
			}
			
		}
		System.out.println(count);



	}

}
