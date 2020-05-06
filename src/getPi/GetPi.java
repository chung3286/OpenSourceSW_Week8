package getPi;

public class GetPi {
	public static void main(String[] args) {
		// Leibniz
		int howmany = 2000000;
		double mark=1, denominator=1, pi=0;

		for(int i=0; i<howmany; i++) {
			pi = pi + mark * (1/denominator);
			mark *= -1;
			denominator += 2;
		}
		pi *= 4;
		System.out.println(pi);
	}
}
