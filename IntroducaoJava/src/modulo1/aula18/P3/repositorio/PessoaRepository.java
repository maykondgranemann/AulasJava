package P3.repositorio;

import java.util.ArrayList;

import P3.modelo.Pessoa;


public class PessoaRepository {
    private ArrayList<Pessoa> lista;

    public PessoaRepository() {
        lista = new ArrayList<>();
    }

    public void create(Pessoa p){
        lista.add(p);
    }

    public ArrayList<Pessoa> read(){
        return lista;
    }

    public void update(Pessoa p){
        for (Pessoa pessoa : lista) {
            if(pessoa.getId() == p.getId()){
                delete(pessoa);
                create(p);
            }
        }
    }
    public void delete(Pessoa p){
        lista.remove(p);
    }
}
