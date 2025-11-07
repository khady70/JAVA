public class TestHeritageSimple {
    public static void main(String[] args) {

        // creation Enseignant
        Enseignant e1 = new Enseignant();
        //La classe eneignant herite de Personne donc unEnseignant est une personne
        //et aura donc implicitement tous les attributs de Personne
        //c'est pourquoi on peut faire e1.id, e1.prebom et e1.nom
        e1.id=2;
        e1.prenom="Babacar";
        e1.nom="Diouf";
        e1.matiere="PHP";
        System.out.println("affiche e1");
        // la methode affiche existe sur Enseignant et sur Personne
        //e1 etant creer a partir de new Enseignant(); la methode affiche de enseignant est prioritaire
        e1.affiche();
       

        
    }
    
}
