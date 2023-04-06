
import java.util.Scanner;
public class JR1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        do{
            try{
                    System.out.println("Digite um número: ");
                    num = sc.nextInt();
                    System.out.println(' ');
                    System.out.println("O número é: "+num);
                    sc.close();
                    break;
                }catch(Exception e){
                System.out.println("Caractere invalido");
                break;
            }
        }while(continuar);
        
    }
}
    

