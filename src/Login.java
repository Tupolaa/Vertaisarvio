import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String[] vastaus = new String[3];
		vastaus[0] = "0";
		vastaus[1] = "0";
		vastaus[2] = "0";
		//array johon tulevat käyttäjän vastaukset
System.out.println("Etunimi?");


	vastaus[0] = in.nextLine();

System.out.println("Sukunimi?");

	vastaus[1] = in.nextLine();
System.out.println("yrityksen verkkotunnus?");

	vastaus[2] = in.nextLine();
for (int i =0; i < vastaus.length ; i++) {
	if(vastaus[i].equals("")) {
		System.out.println("Virhe! Jokin tiedoista puuttui.");
		//if lauseke mikäli käyttäjä ei syötä kaikkia tietoja.
	}
}
GenerateEmail(vastaus);
GenerateUsername(vastaus);
	}//maini loppuu
public static void GenerateEmail(String vastaus[]) {
	System.out.println(vastaus[0] + "." + vastaus[1] + "@" + vastaus[2]);
	//methodi hakee arrayn vastauksista tarvittavat tiedot ja tulostaa ne
}
public static void GenerateUsername(String vastaus[]) {
	System.out.print(vastaus[0].substring(0, 4));
//	for (int i =0; i < vastaus[1].length() ; i++) {
//		System.out.print(vastaus[1].substring(4));
//		}
	String vikat4 = vastaus[1].substring(vastaus[1].length() - 4);
    System.out.print(vikat4);

}

}
