import java.util.Scanner;
public class TestSwitchPourquoi{
    public static void main(String[]args){
        System.out.println("Veuillez entrer votre filiere");
        Scanner sc=new Scanner(System.in);
        String filiere=sc.nextLine();
        if(filiere.equals("DFE")){
            System.out.println("vous ete en Developpement Front-end");

        }else if(filiere.equals("DBE")){
            System.out.println("vous etesen Developpement Bach-end");

        }else if(filiere.equals("APD")){
            System.out.println("vous etesen en Administration ...");
            
        }else if(filiere.equals("MA")){
            System.out.println("vous etesen en Mecanique automobile");

        }
        sc.close();
    }
}