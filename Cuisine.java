package projetexos;

public class Cuisine {
	String tasse;
	String nom;
	String prenom;
	
	String machineCafe(String cafe, String eau, String boutton) {
		String rtasse="Type de café: "+ cafe +"\nMarque d'eau: "+eau+"\nType d'energie: " + boutton + "\n";
		return(rtasse);
	}

}
