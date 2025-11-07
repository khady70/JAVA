public class CompteBancaire {
    int numero;
    double solde;
    Personne proprietaire;
    Personne gestionnaire;

    double deposer(double montant){
        if (montant>0) {
            this.solde += montant;//this.solde=this.solde+montant;

            
        }else{
            System.out.println("le montant doit etre positif , le solde n'est pas modifie");
        }
        return solde;
    }

    double retirer(int montant){
        if (montant>0 && montant<= this.solde) {
            this.solde -= montant;
            
            
        }else{
            System.out.println("Le montant a retirer doit etre positif et inferieur ou egal au solde  ");


        }
        return this.solde;
    }

    void afficherCompte(){
        System.out.println("Compte N° : "+numero);
        System.out.println("Solde : "+solde);
        System.out.println("Gere par: "+gestionnaire.prenom+" "+gestionnaire.nom);
    }
    
}
