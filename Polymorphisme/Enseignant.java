public class Enseignant extends Personne{
    // enseigant est une class fie de la class personne
    String matiere;




    //redefinition de la methode affiche  
    void affiche(){
        System.out.println("je suis formateur  je m'appelle :"+prenom+" "+nom+" et j'enseigne "+matiere);
    }
}