package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ArtistaController;
import model.Artista;

public class ArtistaView {
    public static void main(String[] args) {
        ArtistaController controller = new ArtistaController();
        Scanner sc = new Scanner(System.in);
        int opcao;
        do{
            opcao = menu(sc);
            switch(opcao){
                case 1:
                    cadastrar(controller, sc);
                break;
                case 2:
                    listar(controller);
                break;
            }
        }while(opcao !=0);               
    }

    private static void listar(ArtistaController controller) {
        ArrayList<Artista> lista = controller.listar();
        for (Artista artista : lista) {
            System.out.printf("\nNome: %s, Categoria: %s, Nacionalidade:%s\n", artista.nome, artista.categoria, artista.nacionalidade);
        }
    }

    private static void cadastrar(ArtistaController controller, Scanner sc) {
        Artista artista1 = new Artista();
        System.out.print("Digite o nome:");
        artista1.nome = sc.nextLine();
        System.out.print("Digite a categoria:");
        artista1.categoria = sc.nextLine();
        System.out.print("Digite a nacionalidade:");
        artista1.nacionalidade = sc.nextLine(); 
        controller.salvar(artista1);
    }

    private static int menu(Scanner sc) {
        System.out.print("\t1-Cadastrar\n\t2-Listar\n\t0-Sair\n\n\tEscolha uma opção:");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }
}
