public class Gestionnaire {
    String prenom;
    String nom;
    Boutique boutique;

    //constructeur
    public Gestionnaire(String prenom, String nom, Boutique boutique){
        this.prenom=prenom;
        this.nom=nom;
        this.boutique=boutique;
    }

    
    public void afficherSoldeBoutique(){
        System.out.println("Gestionnaire :"+this.prenom+" "+this.nom);
        boutique.afficherSolde();
    }
    
}
