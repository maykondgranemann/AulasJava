package com.zuplae;



import com.zuplae.dao.ContaCorrenteDao;
import com.zuplae.model.ContaCorrente;

/**
 * Hello world!
 *
 */
public class AppConta 
{
    public static void main( String[] args )
    {
        ContaCorrenteDao dao = new ContaCorrenteDao();
        ContaCorrente model = new ContaCorrente();
        model.setNome("Conta do Joaozin");
        model.setDescricao("Conta zero tarifa");


        dao.create(model);
    }
}
