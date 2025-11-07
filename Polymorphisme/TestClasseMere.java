public class TestClasseMere {
    public static void main(String[] args) {
        //creationde personne
        Personne p1 = new Personne();
        p1.id=1;
        p1.prenom="Abdou";
        p1.nom="Diop";
        System.out.println("affiche p1");
        // la methode p1 de la personne est executee
        p1.affiche();

        //p1.prom=6; ne marche pas car une personne n'est pas forcement un Apprenant

        //p1.promo; p1.matiere="java"; ne marche pas car la personne n'estpas un Enseignant
    }
    
}
