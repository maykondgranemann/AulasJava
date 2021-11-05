package P5.ex2;

public class ViewLista {
    public static void main(String[] args) {
        PontoTuristico pt1 = new PontoTuristico();
        pt1.nome = "Jabaguara";
        pt1.descricao = "Praia da Bruna Brasil";
        pt1.localizacao = "IlhaBela";

        PontoTuristicoLista controller = new PontoTuristicoLista();
        controller.save(pt1);

        for (PontoTuristico pt : controller.read()) {
            System.out.println(pt);
        }
    }
}
