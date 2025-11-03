import java.util.Scanner;
// prenom ,nom ,aga ,poids ,afficher les details de la personne et sa date de naissance 
public class Exercice{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entrer votre prenom");
        String prenom =scanner.nextLine();


        System.out.println("Entrer votre nom");
        String nom =scanner.nextLine();

        System.out.println("Entrer votre age");
        int age =scanner.nextInt();

        System.out.println("Entrer votre datenaissance");
        String datenaissance =scanner.nextLine();

        System.out.println("Entrer votre poids");
        double poids =scanner.nextDouble();

        int anneeActuelle =2025;
        int anneeNaissance= anneeActuelle - age;

        System.out.println("Votre prenom est:" +prenom);
        System.out.println("Votre nom est:" +nom);
        System.out.println("Votre age est:" +age+ "ans" );
        System.out.println("Votre poids est:" +poids);
        System.out.println("Votre date de naissance est:" +anneeNaissance);

        

    }
}