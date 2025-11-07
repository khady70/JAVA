public class TestConsulteur {
    public static void main(String[] args) {
        Personne p=new Personne(1,"Abdou", "Diop");
        //equivalent a
        //Personne p=new Personne();
        //p.numero=1;
        //p.prenom="Abdou;"
        //p.nom="Diop";
        p.addresse="Diamniadio";
        p.presentation();
    }
}
