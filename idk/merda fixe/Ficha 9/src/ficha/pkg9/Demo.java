/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha.pkg9;
import Enums.Enums.*;

/**
 *
 * @author guiba
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                
        Administrative admin = new Administrative("PSD", ContractType.PARTIAL, HabilitacoesLiterarias.LICENCIATURA, 
        "beginContract", "endContract","name", 
        "birthDate","address",1234, 12, 5000);
        
        System.out.println(admin.toString() + "-----------\n\n-----------"); 
        
        ProjectManager pm = new ProjectManager(123, "2 projetos", "01-12-2012", "John", "01-12-2013", 
                "Estrada braba", 271236230, 12345, 5000);
    
        System.out.println(pm.toString() + "-----------\n\n-----------"); 

        PessoaManagement rmpm = new PessoaManagement();
        
        System.out.println(pm.toString() + "-----------\n\n-----------");
        
        rmpm.adicionar(pm);
        
        
        rmpm.remover("John");
        
        System.out.println(rmpm.listProjectManager());

    
    
    
    
    
    
    }
    
}
