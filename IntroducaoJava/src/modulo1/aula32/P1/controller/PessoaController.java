package P1.controller;

import P1.dao.PessoaDao;
import P1.model.Pessoa;

public class PessoaController extends BaseController<Pessoa>{
    public PessoaController() {
        super(new PessoaDao());
    }
}
