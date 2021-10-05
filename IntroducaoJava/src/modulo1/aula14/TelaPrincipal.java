public class TelaPrincipal {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();

        pf.setNome("Maria fofoqueira");
        System.out.println(pf.getNome());

        Cariopse c =  new Cariopse();
        c.folha= "as";

        Moto m = new Moto();
        m.marca = "honda";

        Carro car = new Carro();
        car.marca = "Fiat";
    }
}
