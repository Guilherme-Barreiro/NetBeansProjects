package publicSchool;

public class UC {
    private String nome;
    private String sigla;
    private String curso;
    private String anoLetivo;
    private String semestre;

    public UC(String nome, String sigla, String curso, String anoLetivo, String semestre) {
        this.nome = nome;
        this.sigla = sigla;
        this.curso = curso;
        this.anoLetivo = anoLetivo;
        this.semestre = semestre;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getAnoLetivo() {
        return anoLetivo;
    }
    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}