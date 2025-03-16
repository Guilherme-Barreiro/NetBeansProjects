package pp_ficha_6;

import Enums.Tamanho;
import Enums.Origem;

public class Demo {

    public static void main(String[] args) {

        Ingrediente i1 = new Ingrediente("Azeitona", Origem.VEGETAL, 20);
        Ingrediente i2 = new Ingrediente("Queijo Mozzarella", Origem.ANIMAL, 280);
        Ingrediente i3 = new Ingrediente("Tomate", Origem.VEGETAL, 18);
        Ingrediente i4 = new Ingrediente("Fiambre", Origem.ANIMAL, 150);
        Ingrediente i5 = new Ingrediente("Cogumelos", Origem.VEGETAL, 22);
        Ingrediente i6 = new Ingrediente("Pimento", Origem.VEGETAL, 20);

        Ingrediente[] ing4Estacaos = {i1, i3, i6};
        Pizza p1 = new Pizza("4 Estacaos", "Especialidade da casa", 19.99, Tamanho.FAMILIAR, ing4Estacaos);

        Ingrediente[] ingMargarita = {i2, i3};
        Pizza p2 = new Pizza("Margarita", "Simples mas deliciosa", 14.99, Tamanho.MEDIA, ingMargarita);

        Ingrediente[] ingCarnivora = {i2, i4, i6};
        Pizza p3 = new Pizza("Carnívora", "Para os amantes de carne", 20.99, Tamanho.PEQUENA, ingCarnivora);

        Pizza p4 = new Pizza("Carnívora", "Para os amantes de carne", 20.99, Tamanho.PEQUENA, ingCarnivora);
        Pizza p5 = new Pizza("Carnívora", "Para os amantes de carne", 20.99, Tamanho.PEQUENA, ingCarnivora);
        Pizza p6 = new Pizza("Carnívora", "Para os amantes de carne", 20.99, Tamanho.PEQUENA, ingCarnivora);
        Pizza p7 = new Pizza("Carnívora", "Para os amantes de carne", 20.99, Tamanho.PEQUENA, ingCarnivora);
        Pizza p8 = new Pizza("Carnívora", "Para os amantes de carne", 20.99, Tamanho.PEQUENA, ingCarnivora);
        Pizza p9 = new Pizza("Carnívora", "Para os amantes de carne", 20.99, Tamanho.PEQUENA, ingCarnivora);
        Pizza p10 = new Pizza("Carnívora", "Para os amantes de carne", 20.99, Tamanho.PEQUENA, ingCarnivora);
        Pizza p11 = new Pizza("Carnívora", "Para os amantes de carne", 20.99, Tamanho.PEQUENA, ingCarnivora);
        Pizza p12 = new Pizza("Carnívora", "Para os amantes de carne", 20.99, Tamanho.PEQUENA, ingCarnivora);
        
        Pizza[] ementaTeste = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12};
        Ementa e2 = new Ementa("Designacao", "Descricao", "12/03/2025", ementaTeste);
//        System.out.println(e2);

        

        Pizza[] ementaAtual = {p1, p2, p3};
        Ementa e1 = new Ementa("Designacao", "Descricao", "12/03/2025", ementaAtual);
        
        p1.addIngrediente(i2);
        p1.addIngrediente(i2);
        p1.removeIngrediente(i6);
        p1.removeIngrediente(i2);
        
        
//        p1.searchIngredienteDetails(i2);
//        System.out.println(p1.getCaloriasPizza());
//        System.out.println(p1);
//        System.out.println(e1);
    }

}
