// TestFor2
import java.util.Scanner;

public class TestFor2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Table de multiplication des nombres paires");
        System.out.println("Entrer un nombre");
        int n=sc.nextInt();
        for (int i= 1; i<=10; i=i+2) {
            int res=n*i;
            System.out.println(n+"x"+i+"="+res);
            
        }
        sc.close();
    }
    
}
