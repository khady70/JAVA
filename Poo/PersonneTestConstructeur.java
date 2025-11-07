public class PersonneTestConstructeur {
    public static void main(String[] args) {
        //les constructeurs sans argument
        Personne p1=new Personne();
        System.out.println("numero"+p1.numero);
        System.out.println("prenom1="+p1.prenom);
        //affiche
        //numero1=0
        //prenom1=null
        // aucune variable n'est initialisee



        //constructeur avec trois arguments
        Personne p2=new Personne(1, "Fallou", "Dem");
        System.out.println("num2="+p2.numero);
        System.out.println("prenom2="+p2.prenom);
        System.out.println("nom2="+p2.nom);
        System.out.println("tel2="+p2.tel);
        //affiche
        //num2=1
        //prenom2=Fallou
        //nom2=Dem
        //tel2=null


        //constructeur avec tous les arguments
        Personne p3=new Personne(2, "khady", "Gadiaga",
        "Thies", "08-10-2001", "78 580 97 53");

        System.out.println("numero3="+p3.numero);
        System.out.println("prenom3="+p3.prenom);
        System.out.println("nom3="+p3.nom);
        System.out.println("adresse3="+p3.addresse);
        System.out.println("dateNaissance="+p3.dateNaissance);
        System.out.println("tel3="+p3.tel);

        //affiche
        //num3=2
        //prenom3=khady
        //nom3=Gadiaga
        //adresse3=Thies
        //dateNaissance3=08-10-2001
        //tel3=78 580 97 53
        //
      
    }
   
    
    
}
