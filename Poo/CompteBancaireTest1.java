public class CompteBancaireTest1 {
    public static void main(String[] args) {
        Personne Fatou=new Personne(1, "Fatoumata", "Sambou");
        Personne client1=new Personne(2, "Abdou", "Ka");
        Personne client2=new Personne(3, "Saliou", "Diop");

        CompteBancaire compte1=new CompteBancaire();
        compte1.numero=123456789;
        compte1.gestionnaire=Fatou;
        compte1.proprietaire=client1;
        compte1.solde=2000000.0;

        CompteBancaire compte2=new CompteBancaire();
        compte1.numero=987654321;
        compte2.gestionnaire=Fatou;
        compte2.proprietaire=client2;
        compte2.solde=1400000.0;
        System.out.println("########## affiche les 2 comptes ######## ");
        compte1.afficherCompte();
        // "aller a la ligne"

        System.out.println();
        compte2.afficherCompte();
        compte1.deposer(50000.0);
        System.out.println("######## apres depot 50000 affiche les 2 comptes ########");
        compte1.afficherCompte();
        System.out.println();
        compte2.afficherCompte();
        
        System.out.println("apres retrait");
        int montant=20000;
        compte2.retirer(montant);
        compte2.afficherCompte();
        
    }
}
