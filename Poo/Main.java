public class Main {
    public static void main(String[] args) {
        //creer une boutique
        Boutique boutique =new Boutique("ISEP Shop", "Diamniadio", 5000000, 30000000);

        //creer une gestionnaire
        Gestionnaire gestionnaire= new Gestionnaire("Fatou", "Ndiaye", boutique);

        //operation sur les comptes
        boutique.deposerom(2000000);
        boutique.retirerom(3000);
        boutique.retirerom(50000);
        boutique.retirerwave(200000);
        boutique.retirerwave(4000);
        boutique.deposerwave(500000);
        //afficher les soldes
        gestionnaire.afficherSoldeBoutique();
    }
    
}
