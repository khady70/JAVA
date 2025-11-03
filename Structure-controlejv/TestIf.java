import java.util.Scanner;
public class TestIf {
    public static void main(String[]args){
    int nombre=7;
    System.out.println("Devinez notre nombre compris entre 0 et 9");
    Scanner sc=new Scanner(System.in);
    int nbreDevine=sc.nextInt();
    if(nbreDevine==nombre)
    System.out.println("Bravo! vous avez trouve le nombre");
    else
       System.out.println("Desole c'est pas le bon nombre");
    System.out.println("Merci d'avoir teste notre programme");

    //la ligne precedente ne fait pas partie du else
    sc.close();
   
    }
    
}