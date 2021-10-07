package P1;

public class Teste {
    public static void main(String[] args) {           
        
        Pessoa p1 =  new Pessoa();
        p1.setNome("Ines");
        p1.setSobrenome("Brasil");
           
        
        System.out.printf("Imprimindo a %s \n\t%s"
                   , p1.getNome(),  p1 );
    }
}
