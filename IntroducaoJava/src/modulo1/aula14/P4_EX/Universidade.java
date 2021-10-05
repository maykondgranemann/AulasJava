package P4_EX;

public class Universidade {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Joao");
        f1.setSobrenome("Souza");
        f1.setMatricula("000001");
        f1.setSalario(10000.00);
        f1.setDepartamento("Financeiro");

        Coordenador c1 = new Coordenador();
        c1.setNome("Maria");
        c1.setSobrenome("Da Silva");
        c1.setMatricula("0000002");
        c1.setSalario(15000.99);
        c1.setDepartamento("Educação");
        c1.setBonus(0.1);
        c1.setCursoCoordenado("Medicina");

        Aluno a1 = new Aluno();
        a1.setNome("Enzo");
        a1.setSobrenome("Xoven");
        a1.setMatricula("000003");
        a1.setCurso("Analise e Desenv Software");
        a1.setTurma("Noturno 1");

        System.out.println(f1.getNome());
        System.out.println(c1.getNome());
        System.out.println(a1.getNome());
    }
}
