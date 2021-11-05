package P5.ex2;

public class View {
    public static void main(String[] args) {
        PontoTuristico pt1 = new PontoTuristico();
        pt1.nome = "Jabaguara";
        pt1.descricao = "Praia da Bruna Brasil";
        pt1.localizacao = "IlhaBela";

        IPontoTuristicoCrud controller = null;

        int opcao = 2;
        if(opcao == 1){
            controller = new PontoTuristicoLista();
        }else if(opcao ==2){
            controller = new PontoTuristicoArquivo();
        }
        
        controller.save(pt1);

        for (PontoTuristico pt : controller.read()) {
            System.out.println(pt);
        }
    }
}
