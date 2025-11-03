import java.util.Scanner;
public class Exercice3 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Entrez le premier nombre:");
        double nombre1 = scanner.nextDouble();
        System.out.println("Entrez le second nombre :");
        double nombre2 = scanner.nextDouble();
        System.out.println("Entrez un operateur (+, -, *, /) :");
        char operateur= scanner.next().charAt(0);
        

        switch(operateur){
            case '+':
                System.out.println("Resultat : "+(nombre1 + nombre2));
            break;

            case '-':
                System.out.println("Resultat : "+(nombre1 - nombre2));
            break;

            case '*':
                System.out.println("Resultat : "+(nombre1 * nombre2));
            break;

            case '/':
                if(nombre2 != 0){
                    System.out.println("Resultat : "+(nombre1 / nombre2));
                }else{
                    System.out.println("Division par zero impossible.");
                }
               
            break;
            default:
                System.out.println("Operateur invalide.");
            break;
        }
        scanner.close();
    }
}        