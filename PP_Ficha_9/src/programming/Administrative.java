package programming;

import Enums.ContractType;
import Enums.LiteraryQualifications;
import java.time.LocalDate;

public class Administrative extends Person {
    public String initials;
    public ContractType contrato;
    public LiteraryQualifications literaryQualifications;
    public LocalDate beginContract;
    public LocalDate endContract;

    public Administrative(String initials, ContractType contrato, LiteraryQualifications literaryQualifications, LocalDate beginContract, 
            LocalDate endContract, int id, String name, LocalDate birthDate, String address, String cc, String nif, double baseSalary) {
        super(id, name, birthDate, address, cc, nif, baseSalary);
        this.initials = initials;
        this.contrato = contrato;
        this.literaryQualifications = literaryQualifications;
        this.beginContract = beginContract;
        this.endContract = endContract;
    }

    public Administrative(String initials, ContractType contrato, LiteraryQualifications literaryQualifications, LocalDate beginContract, 
            int id, String name, LocalDate birthDate, String address, String cc, String nif, double baseSalary) {
        super(id, name, birthDate, address, cc, nif, baseSalary);

        if (contrato != ContractType.INTEGRAL) {
            throw new IllegalArgumentException("Este administrativo não tem contrato INTEGRAL.");
        }

        this.initials = initials;
        this.contrato = contrato;
        this.literaryQualifications = literaryQualifications;
        this.beginContract = beginContract;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public ContractType getContrato() {
        return contrato;
    }

    public void setContrato(ContractType contrato) {
        this.contrato = contrato;
    }

    public LiteraryQualifications getLiteraryQualifications() {
        return literaryQualifications;
    }

    public void setLiteraryQualifications(LiteraryQualifications literaryQualifications) {
        this.literaryQualifications = literaryQualifications;
    }

    public LocalDate getBeginContract() {
        return beginContract;
    }

    public void setBeginContract(LocalDate beginContract) {
        this.beginContract = beginContract;
    }

    public LocalDate getEndContract() {
        return endContract;
    }

    public void setEndContract(LocalDate endContract) {
        this.endContract = endContract;
    }

    @Override
    public double calculateInitialSalary(){
        double salary = getBaseSalary();
        switch(this.literaryQualifications){
            case LICENCIATURA:
                salary *= 1.1;
                break;
            case MESTRADO:
                salary *= 1.2;
                break;
            case DOUTORAMENTO:
                salary *= 1.3;
                break;
        }
        return salary;
    }
}
