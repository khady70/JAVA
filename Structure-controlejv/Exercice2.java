import java.util.Scanner;
public class Exercice2 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre entre 0 et 20");
        int note = scanner.nextInt();

        if(note<0 || note >20){
            System.out.println("Note invalide");
        }else if(note <= 9){
            System.out.println("Insiffisant");
        }else if(note <= 13){
            System.out.println("Passable");

        }else if(note <= 16){
            System.out.println("Bien");

        }else{
            System.out.println("Tres bien");

        }
        scanner.close();
    }
}