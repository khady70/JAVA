import java.util.Scanner;
public class MoisEtJours{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entrez le nom d'un mois (ex: janvier) :");
        String mois = scanner.nextLine().toLowerCase();

        switch(mois){
            case "janvier", "mars", "mai", "juillet", "aout", "octobre","decembre":
                System.out.println("31 jours");
            break;
            case "avril", "juin", "septembre", "novembre":
                System.out.println("30 jours");
          break;
            case "fevrier":
                System.out.println("28 ou 29 jours");
            break;

            default:
                System.out.println("Mois invalide");
            break;
        }
        scanner.close();


    }
}