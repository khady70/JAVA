import java.util.Scanner;
public class TestSwitch{
    public static void main(String[]args){
    System.out.println("Veuillez entrer votre filiere");
    Scanner sc=new Scanner(System.in);
    String filiere=sc.nextLine();

    switch (filiere){
        case "DFE":
            System.out.println("Votre departement est TIC");
            System.out.println("Votre filiere Developpement Front-end");
        break;


        case "DBE":
            System.out.println("Votre departement est TIC");
            System.out.println("Votre filiere Developpement Bach-end");
        break;

        case "APD":
            System.out.println("Votre departement est TIC");
            System.out.println("Votre filiere Administration ...");
        break;


        case "MA":
            System.out.println("Votre departement est Automobile");
            System.out.println("Votre filiere  Mecanique automobile");
        break;

        default:
            System.out.println("Le programme ne reconnait pas votre filiere");
        break;



    }
    sc.close();
}

}
