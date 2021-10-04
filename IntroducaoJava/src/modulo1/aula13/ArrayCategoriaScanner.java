import java.util.Scanner;

public class ArrayCategoriaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Categoria[] categorias = new Categoria[3];

        for (int i = 0; i < categorias.length; i++) {
            System.out.printf("Digite o nome da categoria %d", i);
            String nome = sc.nextLine();
            
            System.out.printf("Digite a descricao da categoria %d", i);
            String descricao = sc.nextLine();

            Categoria cat = new Categoria();
            cat.setNome(nome);
            cat.setDescricao(descricao);
            
            categorias[i] = cat;
        }


        for (Categoria c : categorias){
            System.out.printf("%s - %s\n", c.getNome(), c.getDescricao());
        }

    }
}
