public class Boutique {
    String nom1;
    String adresse;
    double soldeom;
    double soldewave;
    // constructeur
    public Boutique(String nom1, String adresse, double soldeom, double soldewave){
        this.nom1=nom1;
        this.adresse=adresse;
        this.soldeom=soldeom;
        this.soldewave=soldewave;
    }

    //methodes
    public void deposerom(double montant){
        if (montant>0) {
        this.soldeom += montant;//this.solde=this.solde+montant;
        System.out.println("Depot de " +montant+ " effectue sur le compte  OM. Nouveau solde : " +this.soldeom);
            
        }
        
           
    }
    public void deposerwave(double montant){
        if (montant>0) {
        this.soldewave += montant;//this.solde=this.solde+montant;
        System.out.println("Depot de " +montant+ " effectue sur le compte Wave. Nouveau solde : " +this.soldewave);
            
        }
       
    }
    public void retirerom(int montant){
        if (montant>0 && montant<= this.soldeom) {
            this.soldeom -= montant;
            System.out.println("Retrait de " +montant+ " effectue sur le compte OM. Nouveau solde : " +this.soldeom);    
        }else{
            System.out.println("Le solde est insuffisant sur OM");


        }

    }
   public void retirerwave(int montant){
        if (montant>0 && montant<= this.soldewave) {
            this.soldewave -= montant;
            System.out.println("Retrait de "+montant+ "effectue sur le compte Wave. Nouveau solde :"+this.soldewave);  
        }else{
            System.out.println("Le solde est insuffisant sur Wave");


        }
    }  
    public void afficherSolde(){
        System.out.println("Boutique :"+this.nom1);
        System.out.println("adesse :"+this.adresse);
        System.out.println("Solde OM :"+this.soldeom+ "FCFA");
        System.out.println("Solde Wave :"+this.soldewave+ "FCFA");
       

    }
}
    

