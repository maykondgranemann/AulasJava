package P1.view;

import P1.controller.PessoaController;
import P1.model.Pessoa;

public class PessoaView {
    public static void main(String[] args) {
        PessoaController pc = new PessoaController();
        Pessoa p1 = new Pessoa();
        p1.id = 5;
        p1.nome= "123asdfsafsd";
        p1.sobrenome = "asdfsadfadsfsaf";

        pc.create(p1);

        for (Object p : pc.read()) {
            System.out.println(p);
        }
        pc.delete(p1);
        System.err.println("Deletando");
        for (Object p : pc.read()) {
            System.out.println(p);
        }


        p1.id = 4;
        p1.nome= "Maykon";
        p1.sobrenome = "Granemann";
        pc.update(p1);

        System.err.println("Alterado");
        for (Object p : pc.read()) {
            System.out.println(p);
        }
    }
}
