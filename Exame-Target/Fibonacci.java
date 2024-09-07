import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int n = sc.nextInt();

        if (estaNaSequencia(n)) {
            System.out.println("O número " + n + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("O número " + n + " não pertence a sequência de Fibonacci.");
        }
        sc.close();
    }

    public static boolean estaNaSequencia(int n) {
        int a = 0, b = 1, temp;
        
        if (n == 0 || n == 1) {
            return true;
        }
        
        while (b < n) {
            temp = a + b;
            a = b;
            b = temp;
        }
        if(b == n) {
            return true;
        }
        else
        return false;
    }
}
