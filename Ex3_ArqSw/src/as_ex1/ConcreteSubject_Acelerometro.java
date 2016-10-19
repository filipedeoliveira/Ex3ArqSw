
package as_ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class ConcreteSubject_Acelerometro implements Subject{
    private List<Monitor> observers = new ArrayList<Monitor>();
    private float acelerometro;
    
    
    public ConcreteSubject_Acelerometro() {
       
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
       
         float acel = getValue();
                    for (Monitor c : observers) {
                        ConcreteObserver_Acelerometro co = new ConcreteObserver_Acelerometro(c.getUser());
                        co.update(acel);
                        
                    }
    }

    @Override
    public void setValue(float value) {
       this.acelerometro = value;
       
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
