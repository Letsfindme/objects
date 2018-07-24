package projetexos;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuisine cuisineSimplon = new Cuisine();
		cuisineSimplon.tasse= "maTasse";
		cuisineSimplon.nom="fadiCuisine";
		cuisineSimplon.prenom="lastnale";
		String rtasse;
		rtasse=cuisineSimplon.machineCafe("arabica", "eauCristaline", "push");
		System.out.println(rtasse);
		
		Cuisine cuisineDeFadi = new Cuisine();
		cuisineDeFadi.tasse="tasse de Fadi";
		cuisineDeFadi.nom="ma cuisine";
		cuisineDeFadi.prenom="prenom de ma cuisine";
		String retourFadi = cuisineDeFadi.machineCafe("Robusta", "alcole", "electricité");
		System.out.println(retourFadi);
	}

}
