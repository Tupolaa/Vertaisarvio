import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String[] vastaus = new String[3];
		vastaus[0] = "0";
		vastaus[1] = "0";
		vastaus[2] = "0";
System.out.println("Etunimi?");
//vastaus1 = in.nextLine();

	vastaus[0] = in.nextLine();

System.out.println("Sukunimi?");

	vastaus[1] = in.nextLine();
System.out.println("yrityksen verkkotunnus?");

	vastaus[2] = in.nextLine();
for (int i =0; i < vastaus.length ; i++) {
	if(vastaus[i].equals("")) {
		System.out.println("Virhe! Jokin tiedoista puuttui.");
	}
}
GenerateEmail(vastaus);
	}//maini loppuu
public static void GenerateEmail(String vastaus[]) {
	System.out.println(vastaus[0] + "." + vastaus[1] + "@" + vastaus[2]);
}
public static void GenerateUsername() {
	
}

}
