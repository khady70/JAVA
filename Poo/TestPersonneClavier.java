import java.util.Scanner;

public class TestPersonneClavier {
    public static void main(String[] args) {
        Personne p1=new Personne();
        Scanner sc=new Scanner(System.in);

        System.out.println("Entrer le numero ");
        p1.numero =sc.nextInt();
        sc.nextLine();
        

        System.out.println("Entrer votre prenomm");
        p1.prenom = sc.nextLine();

        System.out.println("Entrer votre nom");
        p1.nom= sc.nextLine();

        System.out.println("Entrer votre addresse ");
        p1.addresse=sc.nextLine();

        System.out.println("Entrer votre dateNaissance ");
        p1.dateNaissance=sc.nextLine();

        System.out.println("Entrer votre tel :");
        p1.tel=sc.nextLine();



        String presentation="Apprenant "+p1.prenom+ "  " +p1.nom+ " numero " +p1.numero+" tel "+p1.tel+ " Est nee " +p1.dateNaissance+ " habite a " +p1.addresse;
        System.out.println(presentation);
        sc.close();

    }
    
}
