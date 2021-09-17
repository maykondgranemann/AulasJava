package modulo1.aula6;

public class a6_1_semanal {
    public static void main(String[] args) {
        //String nome = "";
        //int numero = 10;
        //byte,short, long,
        //float, double = 0.0
        //if()else
        //if else if else
        /*int contador = 0;

        while(contador < 10){
            System.out.println(contador);
            //contador = contador +1;
            //contador += 1;
            contador ++;
        }
        System.out.println(contador);*/

        /*int cont=0;

        while(cont <= 10){
            int soma = cont +1;
            System.out.println(soma);
            cont++;
        }

        System.out.println(cont); */

        String nome = "";
        String sobrenome = "";
        byte idade = 0;
        double altura = 0;

        System.out.printf(
                // %s== String
                // %d== valores inteiros - int, byte, short, long
                // %f== pontos flutuantes- float, double
                "O nome é %s, o sobrenome %s e a idade %d e altura %.2f",
                nome, sobrenome, idade, altura
        );
    }
}
