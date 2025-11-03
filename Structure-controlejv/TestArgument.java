public class TestArgument{
    public static void main(String[]args){
        int nbreArguments=args.length;
        System.out.println("Nombre d'arguments du progremme est "+nbreArguments);
        String prenom=args[0];
        String nom=args[1];
        String filiere=args[2];
        String promotion=args[3];
        String affiche="prenom="+prenom+", nom="+nom+",filiere="+filiere+", promotion="+promotion;
        System.out.println(affiche);
        
        
    }
}