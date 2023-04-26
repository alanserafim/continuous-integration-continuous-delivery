import org.junit.Test;

import static org.junit.Assert.*;

public class TesteCarro {

    @Test
    public void testeAcelerar() {
        Carro c1 = new Carro("Honda", "city", 2023, 20);
        c1.acelerar(10);
        c1.acelerar(10);
        c1.acelerar(10);
        c1.acelerar(10);
        assertEquals(40, c1.getVelocidade());
    }

    @Test
    public void testeReduzir(){
        Carro c1 = new Carro("Honda", "city", 2023, 20);
        c1.acelerar(100);
        c1.reduzir();
        assertEquals(10, c1.getVelocidade());
    }

    @Test
    public void testeFrear(){
        Carro c1 = new Carro("Honda", "city", 2023, 20);
        c1.acelerar(125);
        c1.frear();
        assertEquals(0, c1.getVelocidade());
    }

    @Test
    public void testeCarroNovo_Ano(){
        Carro c1 = new Carro("Honda", "city", 2023, 20);
        c1.acelerar(30000);
        //assertEquals(true, c1.eCarroNovo());
        assertTrue(c1.eCarroNovo());
    }

    @Test
    public void testeCarroNovo_KM(){
        Carro c1 = new Carro("Honda", "civic", 2010, 20);
        c1.acelerar(1000);
        assertTrue(c1.eCarroNovo());
    }

    @Test
    public void testeCarroVelho(){
        Carro c1 = new Carro("Honda", "civic", 2010, 20);
        c1.acelerar(100000);
        assertFalse(c1.eCarroNovo());
    }




}
