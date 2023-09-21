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
in.close();
Boolean  totta = false;
			//for (int i =0; i < vastaus.length ; i++) {
			//Yritin ensin tehdä for loopilla, että käy arrayn läpi, mutta ei jos
				if(vastaus[0].isEmpty() ||vastaus[1].isEmpty() || vastaus[2].isEmpty()){
					System.out.println("Virhe! Jokin tiedoista puuttui.");
						totta = false;
			//if lauseke mikäli käyttäjä ei syötä kaikkia tietoja.
				} else {
					totta = true;
					}

				if(totta == true) {		
					GenerateEmail(vastaus);
					GenerateUsername(vastaus);
					}
	}//maini loppuu
public static void GenerateEmail(String vastaus[]) {
	
	System.out.println("\nSähköpostiosoite:\n" + vastaus[0].toLowerCase() + "." + vastaus[1].toLowerCase() + "@" + vastaus[2].toLowerCase() + "\n");
	//methodi hakee arrayn vastauksista tarvittavat tiedot ja tulostaa ne
}
public static void GenerateUsername(String vastaus[]) {
	System.out.print("Käyttäjätunnuksesi:\n" + vastaus[0].substring(0, 4).toLowerCase());
	//hakee etunimen 4 ensimmäistä kirjainta substringillä
	
	String vikat4 = vastaus[1].substring(vastaus[1].length() - 4);
		System.out.print(vikat4.toLowerCase());
    //hakee sukunimen 4 viimeistä kirjainta

}
	//.toLowerCase() tekee tekstin pienillä kirjaimilla
}
