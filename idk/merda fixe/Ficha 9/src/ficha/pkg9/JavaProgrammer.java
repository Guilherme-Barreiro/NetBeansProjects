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
public class JavaProgrammer extends Pessoa{
    private int code;
    private int programmingYears;
    private String projectname;
    private ProgrammerType programmerType;
    
    public JavaProgrammer(int code, int programmingYears, String projectname, ProgrammerType programmerType, String name, String birthDate, String address, int citizenCard, int vatNumber, int baseSalary) {
        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.code = code;
        this.programmingYears = programmingYears;
        this.projectname = projectname;
        this.programmerType = programmerType;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getProgrammingYears() {
        return programmingYears;
    }

    public void setProgrammingYears(int programmingYears) {
        this.programmingYears = programmingYears;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public ProgrammerType getProgrammerType() {
        return programmerType;
    }

    public void setProgrammerType(ProgrammerType programmerType) {
        this.programmerType = programmerType;
    }

@Override
    public float getBaseSalary() {
        float salary = 0;
        switch(getProgrammerType()){
            case JUNIOR:
                salary = super.getBaseSalary() * 1.05f * 1.05f + (getProgrammingYears() * 1.005f);
                break;
            case SENIOR: 
                salary = super.getBaseSalary() * 1.05f * 1.15f + (getProgrammingYears() * 1.005f);
                break;
            default:
                System.out.println("Aqui há gato administrative");
        }
        return salary;
    }
    
}
