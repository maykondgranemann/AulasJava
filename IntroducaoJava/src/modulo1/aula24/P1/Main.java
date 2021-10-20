package P1;

public class Main {
    public static void main(String[] args) {
        Dados dados = new Dados();

        Pessoa p1 = new Pessoa();
        p1.nome = "Inês";
        p1.sobrenome = "Brasil";
        p1.idade = 32;

        Aluno a1 = new Aluno();
        a1.nome = "Jojo";
        a1.sobrenome = "Calypso";
        a1.idade = 38;
        a1.matricula = "asdasd";
        a1.turma = "Do fundao";
        a1.curso = "VASP"; 

        dados.add(p1);
        dados.add(a1);

        Pessoa p2 = new Pessoa();
        p2.nome = "Inês";
        p2.sobrenome = "Brasil";
        p2.idade = 32;

        boolean e = dados.existe(p2);
        System.out.println(e);

        dados.remove(a1);
        System.out.println(dados.existe(a1));
    }
}
