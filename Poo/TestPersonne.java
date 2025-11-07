public class TestPersonne {
    public static void main(String[] args) {
      // cree un objet thiombane de type personne
        Personne p1 =new Personne();
        p1.numero=1;
        p1.prenom="Baye ";
        p1.nom="Thiombane";
        p1.dateNaissance="2009-10-24";
        p1.addresse="Diamniadio";
        p1.tel="77 777 77 77";

        String presentation="Apprenant "+p1.prenom+"  "+p1.nom+" numero " +p1.numero+" tel "+p1.tel+ " Est nee " +p1.dateNaissance+ " habite a " +p1.addresse;
        System.out.println(presentation);
    }  
}
