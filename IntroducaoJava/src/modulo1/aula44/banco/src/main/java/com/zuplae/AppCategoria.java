package com.zuplae;


import com.zuplae.model.Categoria;
import com.zuplae.repository.CategoriaRepository;

public class AppCategoria 
{
    public static void main( String[] args )
    {
        CategoriaRepository dao = new CategoriaRepository();

        // Categoria model = new Categoria();
        // model.setId(73);
        // model.setNome("Teste2 com repository base completo Update");       
        // dao.create(model);
        // dao.update(model);
        dao.delete(71);
                
        for (Categoria categoria : dao.read()) {
            System.out.printf("%d - %s\n",categoria.getId(),categoria.getNome());
        }

    }
}
