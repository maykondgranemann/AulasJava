public class Boletim {
    private double m1;
    private double m2;
    private double m3;
    private double m4;    

    public void salvarMedia(int bimestre, double nota1, double nota2, double nota3){
        double media = (nota1 + nota2 + nota3) / 3;

        switch(bimestre){
            case 1:
                m1 = media;
            break;
            case 2:
                m2 = media;
            break;
            case 3:
                m3 = media;
            break;
            case 4:
                m4 = media;
            break;
        }        
    }

    public void imprimirBoletim(){
        System.out.printf("M1: %.2f \nM2: %.2f \nM3: %.2f \nM4: %.2f \n", m1, m2, m3, m4);
    }

    public double mediaBimestre(int bimestre){

        switch(bimestre){
            case 1:
                return m1;
            case 2:
                return m2;
            case 3:
                return m3;
            case 4:
                return m4;
            default:
                // caso bimestre incorreto, retorna 0.0
                return -1.0;
        }      
    }
}
