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

		// párose
		int szam = 2;
		if (szam % 2 == 0) {
			System.out.println("a szám páros");
		} else {
			System.out.println("A szám páratlan");
		}
		// osztható-e
		if (szam % 2 != 0)
			System.out.println("Nem osztható kettővel");
		else if (szam % 3 != 0)
			System.out.println("nem osztható hárommal");

		else if (szam % 5 != 0)
			System.out.println("nem osztható öttel");
		else {
			System.out.println("A szám osztható 2-vel,3-al és 5-tel");
		}
		// hány jegyű
		char[] teszt = args[0].toCharArray();
		if (teszt[0] == '-') {
			System.out.println("Ennyi zsámjegyű: " + (teszt.length - 1));
		} else {
			System.out.println("Ennyi számjegyű: " + teszt.length);
		}
		//melyik a nagyobb
		int szam1=Integer.parseInt(args[0]);
		int szam2=Integer.parseInt(args[1]);
		if(szam1==0||szam2==0)
			System.out.println("mindkét számnak nagyobbnak kell lennie 0-nál");
			else if(szam1>szam2)
				System.out.println("az első szám a nagyobb");
			else if(szam2>szam1)
				System.out.println("A második szám a nagyobb");
			else
				System.out.println("A két szám egyenlő");
		//visszaszámol
		if (szam1>10)
			System.out.println("A szám túl nagy");
		else
			
		switch (szam1) {
		case 10:
			System.out.println("tíz");
		case 9:
			System.out.println("kilenc");
		case 8:
			System.out.println("nyolc");
		case 7:
			System.out.println("hét");
		case 6:
			System.out.println("hat");
		case 5:
			System.out.println("öt");
		case 4:
			System.out.println("négy");
		case 13:
			System.out.println("három");
		case 2:
			System.out.println("kető");
		case 1:
			System.out.println("egy");
			break;

		default:
			break;
		}
		//másodfokú
		
	}


}
