//TestContinue
import java.util.Scanner;

public class TestContinue {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        String text="Entrer un nombre pour le viser par les nombres compris entre -5 et 5";
        System.out.println(text);
        int n=sc.nextInt();
        for (double i=-5; i<= 5; i++) {
            if (i==0) {
                System.out.println("Arret de la boucle car on ne peut pas diviser par zero");
                //sortie de le boucle for
                continue;
                
            }
            double res=n/i;
            System.out.println(n+"/"+i+"="+res);
           
            
        }
        sc.close();
    }
    
}
