package getPi;

public class GetPi {
	public static void main(String[] args) {
		// John Wallis
		int howmany = 2000000, n=1;
		double pi3=1;
		
		for(int i=1; i<howmany; i++) {
			pi3 = pi3 * ((4*Math.pow(n, 2))/(4*Math.pow(n, 2)-1));
			n++;
		}
		pi3 *= 2;
		System.out.println(pi3);
	}
}
