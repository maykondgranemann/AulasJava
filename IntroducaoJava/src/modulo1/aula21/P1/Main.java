package P1;
public class Main{
    public static void main(String[] args) {
        Mae mae = new Mae();
        Filha filha = new Filha();
        Neta neta = new Neta();


        Mae mae2 = new Filha(); // id nome
        Mae mae3 = filha;
        Mae mae4 = new Neta();
        Filha filha2 = new Neta();

        mae3.Falar();
        
        mae2.Falar();
        //mae.Falar();
        //filha.Falar();
        //neta.Falar();


    }
}