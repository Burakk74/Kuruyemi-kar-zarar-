package kuruyemiş;

public class kuruyemiş {

	public static void main(String[] args) {
	
		int findikAdet,leblebiAdet,bademAdet;
		double findikKg,bademKg,leblebiKg,kar;
		findikKg = 15.7;
		bademKg = 22; 
		leblebiKg = 3.5;
		
		findikAdet = 25;
		bademAdet = 40;
		leblebiAdet =12;
       double findikAlim = (findikAdet * findikKg);
       double findikSatis = (findikAlim * 1.4);
       double findikKar = (findikSatis - findikAlim);
       
       double bademAlim = (bademKg * bademAdet);
       double bademSatis = (bademAlim * 1.6);
       double bademKar = (bademSatis - bademAlim);
       
       double leblebiAlim = (leblebiKg * leblebiAdet);
       double leblebiSatis = (leblebiAlim * 1.5);
       double leblebiKar = (leblebiSatis - leblebiAlim);
       
       kar = (bademKar + leblebiKar + findikKar);
       
       System.out.println("Kar :" + kar);
       
    		  if(kar >= 500) {
    			  System.out.print("Kirayı ödeyebilir !");
    		  }
    		  else {
    			  System.out.print("Kirayı ödeyemez !");
    		  }
		
		
		
		
	}

}
