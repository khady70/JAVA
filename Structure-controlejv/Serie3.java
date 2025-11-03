import java.util.Scanner;

public class Serie3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Entrer un nombre");
        int k=sc.nextInt();
        int i=1;
        int result;
        do{
            result=k*i;
            System.out.println(k+"x"+i+"="+result);
            i++;

        }while(i>0 && i<10);
        sc.close();
    }
}
