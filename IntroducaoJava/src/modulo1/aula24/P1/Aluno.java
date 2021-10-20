package P1;

public class Aluno extends Pessoa {
    public String matricula;
    public String turma;
    public String curso;

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Aluno){
            Aluno outro = (Aluno)obj;

            if(this.matricula.equals(outro.matricula) &&
                this.turma.equals(outro.turma) &&
                this.curso.equals(outro.curso) &&
                super.equals(outro)
            ){
                return true;
            }
        }
        
        return false;
    }

    @Override
    public String toString() {
        String retorno =  super.toString() +";"+ this.matricula +";"+ this.turma +";"+ this.curso;
        return retorno;
    }
}
