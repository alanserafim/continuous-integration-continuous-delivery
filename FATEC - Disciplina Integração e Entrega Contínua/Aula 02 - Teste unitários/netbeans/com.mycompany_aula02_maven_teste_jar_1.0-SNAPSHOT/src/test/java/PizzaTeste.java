import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pizza.Pizza;


public class PizzaTeste {
    
    public PizzaTeste() {
    }
    
    @Test
    public void testGetPrecoParaPizzasComAte2Ingredientes(){
        Pizza p1 = new Pizza("Mussarela");
        p1.adicionaIngrediente("Tomate");
        assertEquals(40.0, p1.getPreco(),0);
        
    }
    
    @Test
    public void testGetPrecoParaPizzasComAte5Ingredientes(){
        Pizza p1 = new Pizza("Toscana");
        p1.adicionaIngrediente("Calabresa");
        p1.adicionaIngrediente("Oregano");
        p1.adicionaIngrediente("Mussarela");
        p1.adicionaIngrediente("Manjeiricão");
        assertEquals(60.0, p1.getPreco(),0);
    }
    
    @Test
    public void testeContabilizaIngrediente(){
        Pizza p1 = new Pizza("Portuguesa");
        for (int i = 0; i < 100; i++) {
           p1.adicionaIngrediente("Calabresa"); 
        }
        assertEquals(101, p1.getNumeroIngredientes(),0);
    }



}
