/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as_ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 *
 * @author Stéphane
 */
public class ConcreteSubject_Acelerometro implements Subject{
    private List<Cliente> observers = new ArrayList<Cliente>();
    private float acelerometro;
 
    public ConcreteSubject_Acelerometro(float temp) {
            this.acelerometro = temp;
    }

    @Override
    public void registerObserver(Cliente cli) {
       observers.add(cli);
    }

    @Override
    public void removeObserver(Cliente cli) {
        observers.remove(cli);
    }

    @Override
    public void notifyObservers() {
        for (Cliente c : observers) {
            float acel = getValue();
            System.out.println("!A notificar os clientes!");
                c.update(acel);
              
        }
    }

    @Override
    public void setValue(float value) {
       this.acelerometro = value;
       this.notifyObservers();
    }

    @Override
    public float getValue() {
        float minAc = -2.0f;
        float maxAc = 16.0f;
        float acel;
        Random randAc = new Random();

        acel = randAc.nextFloat() * ((maxAc - minAc) + minAc);
        return acel;
    }
    
}
