public class TestHeritageMethode {
    public static void main(String[] args) {
        Apprenant a1= new Apprenant();
        //Apprenant herite de personne donc un apprenant est une personne
        //et a implicitement tous les attributs de personne        
        a1.id=3;
        a1.prenom="Astou";
        a1.nom="Fall";
        a1.promo=6;
        //l'attribut filiere existe uniquement dans apprenant
        //seule un apprenantpeut faire a1.filiere
        a1.filiere="DFE";
        System.out.println("affiche a1");
        //la methode n'existe pas dans apprenant
        //le systeme va lachercher dans la classe mere personnne
        //et executer lamethode affiche de personne pour l'apprenant
        a1.affiche();// affiche de personne executee car apprenant n'apas de methode affiched
        System.out.println("affiche promo");
        //affichePromo n'existe quedans apprenant
        //seule un apprenant p l'executer
        a1.affichePromo();
    }
    
}
