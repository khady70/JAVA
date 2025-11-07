public class TestHeritage {
    public static void main(String[] args) {
        //creationde personne
        Personne p1 = new Personne();
        p1.id=1;
        p1.prenom="Abdou";
        p1.nom="Diop";
        System.out.println("affiche p1");
        p1.affiche();


        // creation Enseignant
        Enseignant e1 = new Enseignant();
        //dans la class enseignt ily'a pas de variable prenom ,mais puiaque la classee enseigant 
        //hertite de personne elle aura les variable id ,,prenom et nom

        e1.id=2;
        e1.prenom="Babacar";
        e1.nom="Diouf";
        e1.matiere="PHP";
        System.out.println("affiche e1");
        // la matiere est recherchee dans la classe Enseignant sielle n'existe pas la bas
        //elle est alors cherchee dans personne
        e1.affiche();



        Apprenant a1= new Apprenant();
        a1.id=3;
        a1.prenom="Astou";
        a1.nom="Fall";
        a1.promo=6;
        a1.filiere="DFE";
        System.out.println("affiche a1");
        a1.affiche();// affiche de personne executee car apprenant n'apas de methode affiched
        System.out.println("affiche promo");
        a1.affichePromo();


    }
}
