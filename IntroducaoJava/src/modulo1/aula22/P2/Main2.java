package P2;

import java.util.UUID;

public class Main2 {
    public static void main(String[] args) {
        UUID ui = UUID.fromString("c0df7229-c883-4355-89f7-4ee80a1d8510");
        System.out.println(ui);
        UUID ui2 = UUID.fromString("c0df7229-c883-4355-89f7-4ee80a1d8510");
        System.out.println(ui2);
        if(ui.equals(ui2)){
            System.out.println(true);
        }
    }
}
