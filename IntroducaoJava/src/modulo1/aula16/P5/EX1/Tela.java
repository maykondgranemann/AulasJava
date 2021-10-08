package P5.EX1;

public class Tela {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNomeCompleto("Inês Brasil");
        a1.setIdade(38);
        a1.setMatricula("UnDerereUnbadabadá123");   

        Aluno a2 = new Aluno();
        a2.setNomeCompleto("Joelma Calypsoooo");
        a2.setIdade(39);
        a2.setMatricula("AluaMetraiu123");

        System.out.println(a1);
        System.out.println(a2);
    }
}
