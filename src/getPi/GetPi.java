package getPi;

public class GetPi {
	public static void main(String[] args) {
		// Ramanujan
		double pi4=0;
		double n=1103;
		for(int i=1; i<10; i++) {
			n = n + (fact(4*(int)i)*(1103+26390*i))/(Math.pow(fact((int)i), 4)*Math.pow(396, 4*i));
		}
		pi4 = 1/((Math.sqrt(8)/9801)*n);
		System.out.println(pi4);
	}
	
	public static int fact(int n) {
		if(n == 0)
			return 1;
		else if (n == 1)
			return n;
		else 
			return fact(n-1) * n;
	}
}
