package P4;

public class View {
    public static void main(String[] args) {
        IController c = new Controller();
        String retorno = c.salvar("dfgdsg456");
        System.out.println(retorno);

        for (String d : c.ler()) {
            System.out.println(d);
        }
    }
}
