import java.util.Scanner;
public class Exercice1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre :");
        int nombre = sc.nextInt();
        if(nombre > 0){
            System.out.println("le nombre est positif.");
        }else if(nombre <0){
            System.out.println("le nombre est negatif.");

        }else{
            System.out.println("le nombre est nul.");

        }
        sc.close();

    }
}