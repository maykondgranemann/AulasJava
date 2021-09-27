package modulo1;
//// Principio da responsabilidade unica
public class a020 {
    public static void main(String[] args) {
        int s1 = somar(10,84);
        int s2 = somar(5,18);
        int s3 = somar(53,19);
        int m1 = calcula_media(s1, s2, s3);
        System.out.println(m1);
    }

    static int somar(int n1, int n2){
        int resultado = n1 + n2;
        System.out.println(resultado);
        return resultado;
    }
    static int calcula_media(int n1, int n2, int n3){
        int media = (n1 + n2 + n3)/3;
        return media;
    }
}
