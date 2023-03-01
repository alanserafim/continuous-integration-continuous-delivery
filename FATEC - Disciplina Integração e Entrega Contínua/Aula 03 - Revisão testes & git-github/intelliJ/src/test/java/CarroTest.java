import carro.Carro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroTest {

    public CarroTest(){}

    @Test
    public void testAcelerar(){
        Carro carro1 = new Carro("Honda","Civic", 2020, 15);
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        assertEquals(60, carro1.getVelocidade());
    }

    @Test
    public void testFrear(){
        Carro carro1 = new Carro("Honda","Civic", 2020, 15);
        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();
        carro1.acelerar();
        carro1.frear();
        assertEquals(15, carro1.getVelocidade());
    }

    @Test
    public void testParar(){
        Carro carro1 = new Carro("Honda","Civic", 2020, 15);
        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();
        carro1.acelerar();
        carro1.acelerar();
        carro1.parar();
        assertEquals(0, carro1.getVelocidade());
    }




}
