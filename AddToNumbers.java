package Test;

public class AddToNumbers {
	public void m1() {
		int a[]= {2,3,4};
		int b[]= {2,3,4};
		int c;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(i==j) {
					c=a[i]+b[j];
					System.out.println(c);

				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		AddToNumbers n=new AddToNumbers();
	
		n.m1();
		

	}

}
