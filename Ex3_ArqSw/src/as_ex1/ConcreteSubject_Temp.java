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
public class ConcreteSubject_Temp implements Subject{
    private List<Cliente> observers = new ArrayList<Cliente>();
    private float temperatura;
 
       public ConcreteSubject_Temp(float temp) {
            this.temperatura = temp;
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
            float temp = getValue();
            System.out.println("!A notificar os clientes!");
              c.update(temp);
              
        }
    }

    @Override
    public void setValue(float value) {
       this.temperatura = value;
       this.notifyObservers();
    }

    @Override
    public float getValue() {
        float minT = -20.0f;
        float maxT = 60.0f;
        Random randT = new Random();
        
        float temp;
        temp = randT.nextFloat() * ((maxT - minT) + minT);
        return temp;
    }
    
}
