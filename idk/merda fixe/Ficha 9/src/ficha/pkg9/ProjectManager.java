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
public class ProjectManager extends Pessoa{
    private int code;
    private String projects;
    private String contractDate;

    public ProjectManager(int code, String projects, String contractDate, String name, String birthDate, String address, int citizenCard, int vatNumber, int baseSalary) {
        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.code = code;
        this.projects = projects;
        this.contractDate = contractDate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    @Override
    public String toString() {
        String s = "";
        s += super.toString();
                
                
        s += "ProjectManager{" + "code=" + code + ", projects=" + projects + 
                ", contractDate=" + contractDate + '}';
        return s;
    }
    
    
    
}
