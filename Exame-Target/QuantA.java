import java.util.Scanner;
public class QuantA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite uma string: ");
        String s = sc.nextLine();
        int c= quantA(s);
        if(c>0){
            System.out.println("A string contém a letra 'a' e ela aparece "+c+" vezes.");
        } else {
            System.out.println("A string não contém a letra 'a'.");
        }
        sc.close();
    }

    public static int quantA(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                c++;
            }
        }
        return c;
    }
}
