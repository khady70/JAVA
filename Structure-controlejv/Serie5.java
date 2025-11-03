import java.util.Scanner;

public class Serie5 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String response;
        do{
            System.out.println("Entrez le premier nombre:");
            double nombre1 = sc.nextDouble();
            System.out.println("Entrez le second nombre :");
            double nombre2 = sc.nextDouble();
            System.out.println("Entrez un operateur (+, -, *, /) :");
            char operateur= sc.next().charAt(0);
            double result=0;
            boolean operateurValide=true;
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
                        operateurValide=false;
                    }
                
                break;
                default:
                    System.out.println("Operateur invalide.");
                    operateurValide=false;
            } 
            if (operateurValide) {
                System.out.println("Resultat :"+ result);
                
            } 
            System.out.println("Voulez vous faire une autre operation? (oui/non) :");
            response=sc.next(); 
            

        }while(response.equalsIgnoreCase("oui"));
        System.out.println("Merci d'avoir utilise notre programme");
        sc.close();

    }
}