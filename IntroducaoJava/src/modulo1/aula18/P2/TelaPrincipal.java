package P2;

import java.util.ArrayList;

public class TelaPrincipal {

    static ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

    public static void main(String[] args) {
          
        Aluno a1 = new Aluno(1);
        a1.setNome("Michael Douglas");
        a1.setIdade(18);        
        salvar(a1);
       
        Aluno a2 = new Aluno(2);
        a2.setNome("Michael Jordan");
        a2.setIdade(19);
        salvar(a2);

        System.out.println("\nSalvando");
        for (Aluno aluno : listar()) {
            System.out.printf("\nNome: %s - Idade: %d", aluno.getNome(), aluno.getIdade());
        }

        System.out.println("\nAlterando");
        Aluno a3 = new Aluno(2);
        a3.setNome("Inês Brasil");
        a3.setIdade(20);
        alterar(a3);

        
        for (Aluno aluno : listar()) {
            System.out.printf("\nNome: %s - Idade: %d", aluno.getNome(), aluno.getIdade());
        }

        System.out.println("\nDeletando");
        deletar(a1);

        for (Aluno aluno : listar()) {
            System.out.printf("\nNome: %s - Idade: %d", aluno.getNome(), aluno.getIdade());
        }       
       
    }

    //CRUD//

    //CREATE
    static void salvar(Aluno a){
        listaAlunos.add(a);
    }
    //READ
    static ArrayList<Aluno> listar(){
        return listaAlunos;
    }
    //UPDATE
    static void alterar(Aluno a){
        for (Aluno aluno : listaAlunos) {
            if(aluno.getCodigo() == a.getCodigo()){
                deletar(aluno);
                salvar(a);                
            }
        }
    }

    //DELETE
    static void deletar(Aluno a){
        listaAlunos.remove(a);
    }
}
