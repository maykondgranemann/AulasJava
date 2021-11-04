package P3;

public class View {
    public static void main(String[] args) {
        IController c = new Controller();
        String retorno = c.salvar("asdadasd");
        System.out.println(retorno);
    }
}
