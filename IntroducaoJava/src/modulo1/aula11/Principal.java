public class Principal {
    public static void main(String[] args) {
        System.out.println("Programa de cadastro");
        
        Produto p1 = new Produto();
        p1.nome = "Tv";
        p1.descricao = "Tv smart 49'' ";
        p1.valor = 499.99;

        System.out.println(p1.nome);
        System.out.println(p1.quantidade);

    }
}
