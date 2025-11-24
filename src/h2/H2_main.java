package h2;

public class H2_main {
	
	public static boolean compareArrays (int [] a, int [] b) {
		
		if (a.length != b.length) {
			return false;
		}
		
		int i = 0;
		
		while (i< a.length) {
			if (a[i] != b[i]) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4};
		int b [] = {1,2,3,4};
		
		System.out.println (compareArrays (a,b));
	}
}
