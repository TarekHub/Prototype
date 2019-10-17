
public class Utilisateur {
	public static void main(String[] args)
	  {
	    // initialisation de la liasse vierge
	    LiasseVierge liasseVierge = LiasseVierge.Instance();
	    liasseVierge.ajoute(new BonDeCommande());
	    liasseVierge.ajoute(new CertificatCession());
	    liasseVierge.ajoute(new DemandeImmatriculation());
	    
	    // cr�ation d'une nouvelle liasse pour deux clients
	    LiasseClient liasseClient1 = new LiasseClient("Tarek");
	    LiasseClient liasseClient2 = new LiasseClient("Youcef");
	    liasseClient1.affiche();
	    liasseClient2.affiche();
	  }
}
