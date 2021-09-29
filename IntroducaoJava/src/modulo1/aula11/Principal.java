public class Principal {
    public static void main(String[] args) {
        System.out.println("Programa de cadastro");
        
        Produto p1 = new Produto();

        System.out.println(p1.nome);
        System.out.println(p1.descricao);
        System.out.println(p1.valor);
        System.out.println(p1.quantidade);

    }
}
