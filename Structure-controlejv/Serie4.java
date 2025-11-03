import java.util.Scanner;

public class Serie4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter le premier nombre :");
        double nombre1=sc.nextDouble();
        System.out.println("Entrer le second nombre :");
        double nombre2 = sc.nextDouble();
        System.out.println("Entrer un operateur(+, -, *, /)") ;
        char operateur= sc.next().charAt(0);
        
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
        sc.close();
    }
    
}
