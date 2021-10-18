package P1;
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Prod1";
        produto1.descricao = "Prod1 desc";
        produto1.valor = 1000.00;

        Eletrodomestico eletrodomestico1 = new Eletrodomestico();
        eletrodomestico1.nome = "Eletro1";
        eletrodomestico1.descricao = "Eletro1 desc";
        eletrodomestico1.valor = 2000.00;
        eletrodomestico1.voltagem = "220v";

        Produto produto2 = eletrodomestico1;         
        
        imprimir(eletrodomestico1);
    }

    public static void imprimir(Object obj){  
       
        if( obj instanceof Eletrodomestico ){
            System.out.println("É um eletrodomestico");            
            Eletrodomestico eletro = (Eletrodomestico)obj;
            System.out.println(eletro.nome);
            System.out.println(eletro.descricao);
            System.out.println(eletro.valor);
            System.out.println(eletro.voltagem);
        }
        else if(obj instanceof Produto){
            System.out.println("É um produto");
            Produto prod = (Produto)obj;
            System.out.println(prod.nome);
            System.out.println(prod.descricao);
            System.out.println(prod.valor);
        }
    }
}
