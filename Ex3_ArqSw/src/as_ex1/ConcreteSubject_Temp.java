/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as_ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ConcreteSubject_Temp implements Subject{
    private List<Monitor> observers = new ArrayList<Monitor>();
    private float temperatura;
 
        public ConcreteSubject_Temp(){
        }
        
       public ConcreteSubject_Temp(float temp) {
            this.temperatura = temp;
       }

    @Override
    public void registerObserver(Monitor cli) {
       observers.add(cli);
       
    }

    @Override
    public void removeObserver(Monitor cli) {
        observers.remove(cli);
    }

    @Override
    public void notifyObservers() {

       ConcreteObserver_Temp co = new ConcreteObserver_Temp();
        float temp = getValue();
                  for (Monitor c : observers) {  
                        System.out.println(">>>numero de monitor - " + c.getUser() + " - "+ co.update(temp));
                        
                    }
    }

    @Override
    public void setValue(float value) {
       this.temperatura = value;
     
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
