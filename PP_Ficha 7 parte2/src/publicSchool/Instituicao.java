package publicSchool;

public class Instituicao {
    private static int nextId = 1;
    private int id;
    
    private String Nome;
    private String dataNascimento;
    private String morada;
    private String cc;
    private String nif;

    public Instituicao(int id, String Nome, String dataNascimento, String morada, String cc, String nif) {
        this.id = nextId++;
        this.Nome = Nome;
        this.dataNascimento = dataNascimento;
        this.morada = morada;
        this.cc = cc;
        this.nif = nif;
    }

    public static int getNextId() {
        return nextId;
    }
    public static void setNextId(int nextId) {
        Instituicao.nextId = nextId;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getMorada() {
        return morada;
    }
    public void setMorada(String morada) {
        this.morada = morada;
    }
    public String getCc() {
        return cc;
    }
    public void setCc(String cc) {
        this.cc = cc;
    }
    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }
}
