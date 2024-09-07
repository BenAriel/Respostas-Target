public class Soma {
    public static void main(String[] args) {
        int indice = 12;
        int soma=0;
        int k = 1;

        while(k<indice)
        {
            k++;
            soma += k;
           
        }
        //resultado deve ser 77
        System.out.println("valor da soma: " + soma);
    }

}
