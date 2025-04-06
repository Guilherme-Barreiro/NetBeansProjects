package programming;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProjectManager extends Person {

    private int codePM;
    private String[] projects;
    private LocalDate contractDate;

    public ProjectManager(int codePM, String[] projects, LocalDate contractDate, int id, String name, LocalDate birthDate, String address,
            String cc, String nif, double baseSalary) {
        super(id, name, birthDate, address, cc, nif, baseSalary);
        this.codePM = codePM;
        this.projects = projects;
        this.contractDate = contractDate;
    }

    public int getCodePM() {
        return codePM;
    }

    public void setCodePM(int codePM) {
        this.codePM = codePM;
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    @Override
    public double calculateInitialSalary() {
        double salarioInicial = getBaseSalary() * 1.15;

        long anosTrabalho = ChronoUnit.YEARS.between(contractDate, LocalDate.now());
        int nProjetos = (projects != null) ? projects.length : 0;

        double bonusAnos = anosTrabalho * 0.015 * salarioInicial;
        double bonusProjetos = nProjetos * 0.01 * salarioInicial;

        return salarioInicial + bonusAnos + bonusProjetos;
    }

}
