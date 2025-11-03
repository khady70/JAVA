import java.util.Scanner;

public class Serie2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        int n=sc.nextInt();
        int i=1;
        int result;
        while(i>0 && i<=10){
            result=n*i;
            System.out.println(n+"x"+i+"="+result);
            i++;
    
    
    
        } 
        sc.close();     
    
    }
}
