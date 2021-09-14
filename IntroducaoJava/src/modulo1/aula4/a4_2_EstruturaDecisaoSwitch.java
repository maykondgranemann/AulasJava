package modulo1.aula4;

public class a4_2_EstruturaDecisaoSwitch {

    public static void main(String[] args) {
        int idade = 15;
        String nome = "asd";

        switch (nome){
            case "dyego":
                System.out.println("Valor 1");
                break;
            case "granemann":
                System.out.println("Valor 5");
                break;
            case "maykon":
                System.out.println("Valor 10");
                break;
            default:
                System.out.printf("Valor default %s", nome);
                break;
        }
    }
}
