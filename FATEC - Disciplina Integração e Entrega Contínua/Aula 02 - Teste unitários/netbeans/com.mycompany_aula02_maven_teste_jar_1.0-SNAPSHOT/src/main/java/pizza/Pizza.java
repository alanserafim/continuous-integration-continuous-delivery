package pizza;

import java.util.HashMap;
import java.util.Map;

public class Pizza {
    //Criando uma tabelo com uma string e um numero inteiro
    Map<Integer, String> ingredientes = new HashMap<Integer, String>();
    private String sabor;
    private double preco;
    
    private int indice = 0;
    //Numero de ingredientes por pizza
    int numero_ingredientes = 0;
    int numero_pizzas = 0;

    public Pizza(String sabor) {
        this.sabor = sabor;
        numero_pizzas++;

        //toda pizza terá no mínimo 1 ingrediente: o ingrediente do sabor
        adicionaIngrediente(sabor);
    }

    public void adicionaIngrediente(String ingrediente) {
        ingredientes.put(indice++, ingrediente);
        contabilizaIngrediente();
    }

    public void contabilizaIngrediente() {
        numero_ingredientes++;
    }

    public double getPreco() {
        if (ingredientes.size() <= 2) {
            preco = 40.00;
        } else if (ingredientes.size() <= 5) {
            preco = 60.00;
        } else {
            preco = 90.00;
        }

        return preco;
    }

    public String getSabor() {
        return sabor;
    }

    public int getNumeroIngredientes() {
        return numero_ingredientes;
    }

    public void listarIngredientes() {
        for (int i = 1; i <= ingredientes.size(); i++) {
            System.out.println(i + " - " + ingredientes.get(i));
        }
    }
}
