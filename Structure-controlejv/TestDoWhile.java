import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean continuer=true;
        String prenom;
        String nom;
        do{
            System.out.println("Entrer votre prenom :");
            prenom=sc.nextLine();
            System.out.println("Entrer votre nom :");
            nom=sc.nextLine();
            System.out.println("Apprenant "+prenom+" "+nom+" ajoute");
            System.out.println("Voulez vous ajouter un autre apprenant[oui|non]");
            String response=sc.nextLine();
            // equals coompare en respectant la casse oui different de oui
            //equalsIgnoreCase compare sans respecter la casse oui=Oui
            if (response.equalsIgnoreCase("oui")) {
                continuer=true;
                
            }else{
                continuer=false;
            }

        }while(continuer);
        System.out.println("Merci d'avoir utilise notre programma");
        sc.close();
    }
    
}
