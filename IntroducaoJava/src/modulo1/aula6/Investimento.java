package modulo1.aula6;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Investimento {
    public static void main(String[] args) {
        for (int i =0; i <10; i++){
            for (int j=2;j<i; j++){
                if(i%j==0){

                    break;
                }
            }
        }


        /*double investimento = 5000;
        double valor = 0;
        for (int i =1; i<=24; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }*/

        /*ArrayList sorteados = new ArrayList();
        Random random = new Random();
        while(sorteados.size() <10){
            int sorteado = random.nextInt(10);
            if(!sorteados.contains(sorteado)){
                sorteados.add(sorteado);
            }
        }
        System.out.println(sorteados);*/
    }
}
