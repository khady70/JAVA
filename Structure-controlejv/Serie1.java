import java.util.Scanner;

public class Serie1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int n=sc.nextInt();
        for (int i=1; i<=10; i++) {
            int res=i*n;
            System.out.println(n+"x"+i+"="+res);
            
        }
        sc.close();
    }
}
