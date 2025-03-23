package publicSchool;

import Enums.TipoContrato;

public class Professor extends Instituicao{    
    private String Sigla;
    private TipoContrato tipoContrato;
    private UC[] ucs;

    public Professor(String Sigla, TipoContrato tipoContrato, UC[] ucs, int id, String Nome, 
            String dataNascimento, String morada, String cc, String nif) {
        super(id, Nome, dataNascimento, morada, cc, nif);
        this.Sigla = Sigla;
        this.tipoContrato = tipoContrato;
        this.ucs = ucs;
    }

    public String getSigla() {
        return Sigla;
    }
    public void setSigla(String Sigla) {
        this.Sigla = Sigla;
    }
    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }
    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    public UC[] getUcs() {
        return ucs;
    }
    public void setUcs(UC[] ucs) {
        this.ucs = ucs;
    }
}
