package h1;

public class H1_main {
	
	public static boolean isMirrorArray (int [] a, int [] b) {

		
		if (a.length != b.length) {
			return false; 
		}
		int i=0;
		
		while (i < a.length) {
			
			if (a [i] != b [a.length - i-1]) {
				return false;
			}
			i++;
		}
		return true;

		

	}
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4};
		int b [] = {4,3,2,1};
	
		
		System.out.println (isMirrorArray(a,b));
		
	}

}
