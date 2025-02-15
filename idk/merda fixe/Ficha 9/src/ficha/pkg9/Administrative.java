/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha.pkg9;

import Enums.Enums.*;

/**
 *
 * @author guiba
 */
public class Administrative extends Pessoa {

    private String initials;
    private ContractType contractType;
    private HabilitacoesLiterarias habilitacoesLiterarias;
    private String beginContract;
    private String endContract;

    public Administrative(String initials, ContractType contractType, HabilitacoesLiterarias habilitacoesLiterarias, String beginContract, String endContract, String name, String birthDate, String address, int citizenCard, int vatNumber, int baseSalary) {
        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.initials = initials;
        this.contractType = contractType;
        this.habilitacoesLiterarias = habilitacoesLiterarias;
        this.beginContract = beginContract;
        this.endContract = endContract;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public HabilitacoesLiterarias getHabilitacoesLiterarias() {
        return habilitacoesLiterarias;
    }

    public void setHabilitacoesLiterarias(HabilitacoesLiterarias habilitacoesLiterarias) {
        this.habilitacoesLiterarias = habilitacoesLiterarias;
    }

    public String getBeginContract() {
        return beginContract;
    }

    public void setBeginContract(String beginContract) {
        this.beginContract = beginContract;
    }

    public String getEndContract() {
        return endContract;
    }

    public void setEndContract(String endContract) {
        this.endContract = endContract;
    }

    @Override
    public float getBaseSalary() {
        float salary = 0;
        switch(getHabilitacoesLiterarias()){
            case LICENCIATURA:
                salary = super.getBaseSalary() * 1.1f;
                break;
            case MESTRADO: 
                salary = super.getBaseSalary() * 1.2f;
                break;            
            case DOUTORAMENTO:
                salary = super.getBaseSalary() * 1.3f;
                break;            
            default:
                System.out.println("Aqui há gato administrative");
        }
        return salary;
    }

    @Override
    public String toString() {
        String s = "";
        s += super.toString();
        s += "Administrative{" + "initials=" + initials + ", contractType=" + contractType + ", habilitacoesLiterarias=" + habilitacoesLiterarias + ", beginContract=" + beginContract + ", endContract=" + endContract + '}';
        return s;
    }



    

}
