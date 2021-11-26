package com.zuplae;



import com.zuplae.model.ContaCorrente;
import com.zuplae.repository.ContaCorrenteRepository;

/**
 * Hello world!
 *
 */
public class AppConta 
{
    public static void main( String[] args )
    {
        ContaCorrenteRepository dao = new ContaCorrenteRepository();
        ContaCorrente model = new ContaCorrente();
        model.setNome("Conta do Joaozin");
        model.setDescricao("Conta zero tarifa");


        dao.create(model);
    }
}
