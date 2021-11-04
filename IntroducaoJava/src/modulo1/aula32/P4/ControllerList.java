package P4;

import java.util.ArrayList;

public class ControllerList implements IController {
    private ArrayList<String> dados;

    public ControllerList() {
        this.dados = new ArrayList<String>();
    }
    public String salvar(String dado) {
        this.dados.add(dado);
        return "Dado: "+ dado + " salvo com sucesso!";
    }

    public ArrayList<String> ler() {
        return this.dados;
    }
    
}
