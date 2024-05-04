package week1assignment;

public class FibonacciNumber {

	public static void main(String[] args) {
		int f1 = 0, f2 = 1,f3,range = 8;
		System.out.println(f1 + " " + "\n"+ f2 );
		for(int k=2;k<range ; ++k) {
			f3 = f1 + f2;

			System.out.println(""+f3);
			f1=f2;
			f2 = f3;

		}
		
	}

}


