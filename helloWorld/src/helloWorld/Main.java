package helloWorld;

public class Main {

	public static void main(String[] args) {
		//int i = 10;
		//char a = 'a';
		//char A = 65;
		//double j = 2.5;
		//String szoveg = "valami";
		//boolean igaze = true;
		//final double PI=3.14;
		//System.out.println(i + " " + j + " " + a + " " + A + " " + szoveg);
		//terminális operátor
		//String szo=igaze? "igaz":"hamis";
		
		//System.out.println("valami");
		//System.out.println(!igaze);
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int terulet;
		int kivonas=a-b;
		int kerulet= a+b+c;
		
		System.out.println("Kerület: "+kerulet);
		
	}

}
