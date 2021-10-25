
public class PrimeirosErros{
    public static void main(String[] args) {
        
        String nome=null;
        //nome.length();  //NullPointerException
        int idade  = Integer.parseInt("-10"); //"10asdasda" -  NumberFormatException
       
        if(idade <= 0 || idade > 150){
            throw new IllegalArgumentException("Idade invalida"); // Lancando uma excecao
        }
        
    }
}