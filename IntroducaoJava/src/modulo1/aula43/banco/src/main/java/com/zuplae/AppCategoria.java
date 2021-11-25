package com.zuplae;


import com.zuplae.dao.CategoriaDao;
import com.zuplae.model.Categoria;

public class AppCategoria 
{
    public static void main( String[] args )
    {
        CategoriaDao dao = new CategoriaDao();

        Categoria model = new Categoria();
        model.setId(71);
        model.setNome("Teste2 dao update");       

        dao.delete(71);
                
        for (Categoria categoria : dao.read()) {
            System.out.printf("%d - %s\n",categoria.getId(),categoria.getNome());
        }

    }
}
