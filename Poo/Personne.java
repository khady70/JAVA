class Personne{
    // attribut / proprietes
  int numero;
  //attribut / proprietes
  String prenom;
   String nom;
   String addresse;
   String dateNaissance;
   String tel;

   Personne(){
    System.out.println("constructeur sans argument");
    //permet
    //personne=new personne();
   }

   Personne(int num, String p, String n){
    System.out.println("constructeur avec 3 arguments");
    this.numero=num;
    this.prenom=p;
    this.nom=n;
    //permet
    //personne p=new Personne(1,"khady","Fall");

   }

   Personne(int numero, String prenom, String nom, String adresse, String dateNaissance, String tel){
    System.out.println("constructeur avec tous les arguments");
    this.numero=numero;
    this.nom=nom;
    this.prenom=prenom;
    this.addresse=adresse;
    this.dateNaissance=dateNaissance;
    this.tel=tel;
    //permet
    //personne p=new personne(2,)
   }

   void presentation(){
    String txt="je suis "+prenom+" j'habite "+addresse;
    System.out.println(txt);
   }

}