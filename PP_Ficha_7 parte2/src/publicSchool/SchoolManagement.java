package publicSchool;

public class SchoolManagement {
    private static int MAX_TAM_PROF = 20;
    private static int MAX_TAM_FUNC = 20;
    private static int MAX_TAM_ALUN = 20;
    
    private int nPessoas;

    private Professor[] professores;
    private int nProfessores;

    private Funcionario[] funcionarios;
    private int nFuncionarios;

    private Aluno[] alunos;
    private int nAlunos;
    
    public SchoolManagement() {
        professores = new Professor[MAX_TAM_PROF];
        funcionarios = new Funcionario[MAX_TAM_FUNC];
        alunos = new Aluno[MAX_TAM_ALUN];
        this.nProfessores = 0;
        this.nFuncionarios = 0;
        this.nAlunos = 0;
    }
    
    
    
    
    
    
}
