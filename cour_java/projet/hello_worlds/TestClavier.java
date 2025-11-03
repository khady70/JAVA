// obligatoire
import java.util.Scanner;
// prenom ,nom ,aga ,poids ,afficher les details de la personne et sa date de naissance 
public class TestClavier{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entrer votre prenom");


        String prenom =scanner.nextLine();
        int nbEtudiant=scanner.nextInt();
        System.out.println("Votre prenom est:" +prenom);
    
    }

}