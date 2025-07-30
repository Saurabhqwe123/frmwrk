package Test;

import java.util.HashSet;
import java.util.Set;

public class StringH {

	public static void main(String[] args) {
		/*String str="swissee";
		char arr[]=str.toCharArray();
		Set<Character>ch=new HashSet<Character>();
		for(char arr1:arr) {
			ch.add(arr1);
		}
		System.out.println(ch);*/
		int str[]={0,1,1,0,0,1,1,1,0,0,0,1,1,1,1,0};
		//char arr[]=str.toCharArray();
		int maxConsecutiveOnes=0;
		int count=0;
		for(int i=0;i<str.length;i++) {
			if(str[i]==1)
			{
				count++;
				maxConsecutiveOnes=Math.max(maxConsecutiveOnes, count);
				
			}
			else {
				count=0;
			}
			

		}
		System.out.println(maxConsecutiveOnes);
        

	}

}
