public class TestBlocCode{
    public static void main(String[] args){
        int a=5;
        // bloc
        {
            int b=8;
            // variable a et b sont accessible
            System.out.println("a="+a+" b="+b);
        {
            int c=13;
            //a b et c sont disponible
            System.out.println("a="+a+" b="+b+" c="+c);
        }
        //variable a et b sont accessible mais c n'est pas accessible

        }
       
        // b n'est pas disponnible ici(exterieur bloc)

    }
}