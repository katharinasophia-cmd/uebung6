package h3;

public class H3_main {
	
	public static boolean compareArraysVal (int [] a, int [] b) {
		
		if (a.length != b.length) {
			return false;
		}
		
		int i = 0;
		int zahl = 0;
		int anzahla = 0;
		int anzahlb = 0;
		
		while (i<a.length) {
			
		zahl = a[i];
		
		System.out.println ("zahl " + zahl);
		System.out.println ("AI " + a[i]);
		
		
		   for (int j=0; j<a.length; j++) {
				 if (zahl == a[j]) {
					 anzahla ++;  
			 }
		   }
		   System.out.println ("AnzahlA " + anzahla);
		   
		   
			 for (int k=0; k<b.length; k++) {
				 if (zahl == b[k]) {
					 anzahlb ++;
				 }
			 }
	
			 System.out.println ("AnzahlB " + anzahlb);
			 
			 if (anzahla  != anzahlb) {
				 return false;
			 }
			 i++;
			 anzahla = 0;
			 anzahlb = 0;
	}
		return true;
}
	
	public static void main(String[] args) {
		
		int [] a = {1,34,34,5,6};
		int [] b = {34,1,34,6,5};
		
		System.out.println (compareArraysVal(a,b));
	}
	

}
