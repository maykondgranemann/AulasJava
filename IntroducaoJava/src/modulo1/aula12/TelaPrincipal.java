public class TelaPrincipal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Maykon");
        String n = p1.getNome(); 
        System.out.println(n);
        
        p1.setSobrenome("Granemann");
        String s = p1.getSobrenome();
        System.out.println(s);

        p1.setIdade(18);
        int i = p1.getIdade();
        System.out.println(i);

        p1.setCpf("053.555.199-88");
        String c = p1.getCpf();
        System.out.println(c);

    }
}
