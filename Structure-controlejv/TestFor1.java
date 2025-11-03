//TestFor1
import java.util.Scanner;

public class TestFor1 {
    public static void main(String[] args){
        // int i=0 est executer une seule fois lorsqu'on atteint la boucle
        //on test i<=10 si c'est vrai le instruction dans la boucle sont executees
        //apres execition des instruction le systeme execute l'instruction i++
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrer un nombre");
        int n=sc.nextInt();
        for (int i=1; i<=10; i++) {
            int res=i*n;
            System.out.println(n+"x"+i+"="+res);
            
        }
        System.out.println("Merci d'avoir utilise notre programme");
        sc.close();
    }
    
}
