package getPi;

public class GetPi {
	public static void main(String[] args) {
		// Euler
		int howmany = 2000000;
		int n=1;
		double pi2=0;
		for(int i=0; i<howmany; i++) {
			pi2 = pi2 + 1 / (Math.pow(n, 2));
			n++;
		}
		pi2 = Math.sqrt(pi2*6);
		System.out.println(pi2);
	}
}
