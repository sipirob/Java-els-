package helloWorld;

public class Main {

	public static void main(String[] args) {
		// int i = 10;
		// char a = 'a';
		// char A = 65;
		// double j = 2.5;
		// String szoveg = "valami";
		// boolean igaze = true;
		// final double PI=3.14;
		// System.out.println(i + " " + j + " " + a + " " + A + " " + szoveg);
		// terminális operátor
		// String szo=igaze? "igaz":"hamis";

		// System.out.println("valami");
		// System.out.println(!igaze);

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int e = Integer.parseInt(args[4]);
		int terulet;
		int kivonas = a - b;
		int osszead = a + b;
		int kerulet = a + b + c;

		double hanyados = (double) a / b;

		System.out.println("Kerület: " + kerulet);
		System.out.println("különbség: " + kivonas);
		System.out.println("összege: " + osszead);
		System.out.println("hányadosa: " + hanyados);

		int atlag = (a + b + c + d + e) / args.length;
		System.out.println("átlaga: " + atlag);
		int szamtaniKozep = (a + b + c + d + e) / atlag;
		System.out.println("számtani közepe: " + szamtaniKozep);

		// masodfokú egyenlet
		double diszkriminans = Math.sqrt(b * b - 4 * a * c);
		System.out.println(diszkriminans);

		double x1 = (-b + diszkriminans) / 2 * a;
		double x2 = (-b - diszkriminans) / 2 * a;
		System.out.println("x1= " + x1);
		System.out.println("x2= " + x2);
		
		//párose
		int szam=2;
		if (szam%2==0) {
			System.out.println("a szám páros");
		}
		else {
			System.out.println("A szám páratlan");
		}
				

	}

}
