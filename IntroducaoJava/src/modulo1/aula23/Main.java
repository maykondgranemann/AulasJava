import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {       
        // ArrayList<Object> a = new ArrayList<Object>();
        // a.remove(o)

        Pessoa p1 = new Pessoa();
        p1.nome = "Jojo";
        p1.sobrenome = "DoCalypso";

        Carro c1 = new Carro();
        c1.marca = "VW";
        c1.modelo = "BrasiliaAmarela";

        Dados dados = new Dados();
        System.out.println(dados.contains(c1));
        
        System.out.println(dados.add(p1));
        System.out.println(dados.contains(p1));
        System.out.println(dados.add(c1)); 

        System.out.println(dados.contains(p1));
        System.out.println(dados.contains(c1));

        System.out.println(dados.add(p1));
        System.out.println(dados.add(c1)); 
        System.out.println(dados.add(p1));
        System.out.println(dados.add(c1));
        System.out.println(dados.size()); 
        
        System.out.println(dados.remove(c1));
        
    }
}