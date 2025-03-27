package publicSchool;

import Enums.TipoContrato;

public class Aluno extends Instituicao{
    private int codAluno;
    private UC[] ucs;

    public Aluno(int codAluno, UC[] ucs, int id, String Nome, String dataNascimento, 
            String morada, String cc, String nif) {
        super(id, Nome, dataNascimento, morada, cc, nif);
        this.codAluno = codAluno;
        this.ucs = ucs;
    }

    public int getCodAluno() {
        return codAluno;
    }
    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }
    public UC[] getUcs() {
        return ucs;
    }
    public void setUcs(UC[] ucs) {
        this.ucs = ucs;
    }
}
