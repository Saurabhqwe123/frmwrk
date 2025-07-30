package Test;

import java.util.HashMap;
import java.util.Map;

public class TestJava {

	public static void main(String[] args) {
		String str = "saurabh";
		Map<Character,Integer>str1=new HashMap<Character,Integer>();
		char arr[]=str.toCharArray();
		for(char str2 :arr) {
			if(!str1.containsKey(str2)) {
				str1.put(str2,1);
			}
			else {
				str1.put(str2,str1.get(str2)+1);
			}
		}
		for(Character x:str1.keySet()) {
			System.out.println("The count of word:"+x+" = "+str1.get(x));
			if(str1.get(x)>1) {
				
				System.out.println("Duplicate element is :"+x+" = "+str1.get(x));
				System.out.println(x+str1.get(x));

				
			}
		}
		

	}

}
