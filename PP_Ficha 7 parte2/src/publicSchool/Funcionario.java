package publicSchool;

import Enums.TipoContrato;

public class Funcionario extends Instituicao{
    private int codFuncionario;
    private TipoContrato tipoContrato;

    public Funcionario(int codFuncionario, TipoContrato tipoContrato, int id, String Nome, 
            String dataNascimento, String morada, String cc, String nif) {
        super(id, Nome, dataNascimento, morada, cc, nif);
        this.codFuncionario = codFuncionario;
        this.tipoContrato = tipoContrato;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }
    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }
    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
