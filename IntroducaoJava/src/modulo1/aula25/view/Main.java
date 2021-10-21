package view;

import models.Endereco;
import models.Pessoa;
import models.PessoaFisica;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.id = 10;
        pf.nome = "Inex";

        Endereco end1 =  new Endereco();
        end1.logradouro = "Av JK";
        end1.numero = "2088";
        end1.complemento = "Apto 4666";
        end1.cep = "88987-555";
        end1.cidade = "Blumenau"; 
        end1.estado = "Santa Catarina";
        pf.enderecoResidencial = end1;
       
        pf.enderecoComercial = end1;

        System.out.println(pf.enderecoResidencial.logradouro);
        System.out.println(pf.enderecoComercial.logradouro);

        System.out.println("Alteracoes");
        end1.logradouro = "Av Brasil";
        
        System.out.println(pf.enderecoResidencial.logradouro);
        System.out.println(pf.enderecoComercial.logradouro);

        end1 = new Endereco();
        System.out.println(end1.logradouro);
        System.out.println(pf.enderecoResidencial.logradouro);
        System.out.println(pf.enderecoComercial.logradouro);
        
    }
}
