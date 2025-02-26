/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_ficha_5;

/**
 *
 * @author guiba
 */
public class Expense {
    protected int id;
    protected String type;
    protected float amount;
    protected String date;
    protected static int nextId = 0;
    
    public Expense(String tempType, float tempAmount, String tempDate) {
        id = nextId++;
        type = tempType;
        amount = tempAmount;
        date = tempDate;
    }

    @Override
    public String toString() {
        return "Expense{" + "id=" + id + ", type=" + type + ", amount=" + amount + ", date=" + date + '}';
    }
    
    
}
