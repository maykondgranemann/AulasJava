public class ArrayStrings {
    public static void main(String[] args) {
        String[] nomes = new String[5];

        //  valor default para String == NULL
        System.out.println(nomes[0]);

        nomes[0] = "Maykon";
        nomes[1] = "João";
        nomes[2] = "Maria";
        nomes[3] = "Marta";
        nomes[4] = "Anna";        

        // percorrendo o array atraves do laco for
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);            
        }

    }
}
