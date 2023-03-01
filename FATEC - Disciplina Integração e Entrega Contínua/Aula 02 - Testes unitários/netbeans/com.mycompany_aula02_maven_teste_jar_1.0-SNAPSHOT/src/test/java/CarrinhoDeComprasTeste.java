import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pizza.CarrinhoDeCompras;
import pizza.Pizza;

/**
 *
 * @author dti
 */
public class CarrinhoDeComprasTeste {
    
    public CarrinhoDeComprasTeste() {
    }
    
    @Test
    public void testeTotalPagar(){
        Pizza p1 = new Pizza("Mussarela");
        p1.adicionaIngrediente("Calabresa");
        p1.adicionaIngrediente("Oregano");
        
        Pizza p2 = new Pizza("Três Queijos");
        p1.adicionaIngrediente("Calabresa");
        p1.adicionaIngrediente("Oregano");
        
        CarrinhoDeCompras c1 = new CarrinhoDeCompras();
        c1.adicionarItem(p1);
        c1.adicionarItem(p2);
        assertEquals(100, c1.getTotalPagar(),0);
        
    }
    
    @Test
    public void testeQtdePizzaCarrinho(){
        Pizza p1 = new Pizza("Mussarela");
        Pizza p2 = new Pizza("Três Queijos");
        Pizza p3 = new Pizza("Três Queijos");
        Pizza p4 = new Pizza("Três Queijos");

        CarrinhoDeCompras c1 = new CarrinhoDeCompras();
        c1.adicionarItem(p1);
        c1.adicionarItem(p2);
        c1.adicionarItem(p3);
        c1.adicionarItem(p4);
        assertEquals(4, c1.totalPizzasAdicionadas() ,0);
        
    }
}
    
