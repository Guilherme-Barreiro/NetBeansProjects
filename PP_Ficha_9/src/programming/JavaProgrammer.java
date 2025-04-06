/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming;

import Enums.ProgrammerType;
import java.time.LocalDate;

/**
 *
 * @author guiba
 */
public class JavaProgrammer extends Person{

    private int codeJP;
    private int programmingYears;
    private String projectName;
    private ProgrammerType programmerType;

    public JavaProgrammer(int codeJP, int programmingYears, String projectName, ProgrammerType programmerType, int id, String name, 
            LocalDate birthDate, String address, String cc, String nif, double baseSalary) {
        super(id, name, birthDate, address, cc, nif, baseSalary);
        this.codeJP = codeJP;
        this.programmingYears = programmingYears;
        this.projectName = projectName;
        this.programmerType = programmerType;
    }

    public int getCodeJP() {
        return codeJP;
    }

    public void setCodeJP(int codeJP) {
        this.codeJP = codeJP;
    }

    public int getProgrammingYears() {
        return programmingYears;
    }

    public void setProgrammingYears(int programmingYears) {
        this.programmingYears = programmingYears;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ProgrammerType getProgrammerType() {
        return programmerType;
    }

    public void setProgrammerType(ProgrammerType programmerType) {
        this.programmerType = programmerType;
    }

    @Override
    public double calculateInitialSalary(){
        double salary = getBaseSalary() * 1.05;
        switch(this.programmerType){
            case JUNIOR:
                salary *= 1.05;
                break;
            case SENIOR:
                salary *= 1.15;
                break;
        }
        return salary;
    }
}
