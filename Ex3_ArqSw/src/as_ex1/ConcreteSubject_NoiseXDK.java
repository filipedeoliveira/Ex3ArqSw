
package as_ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ConcreteSubject_NoiseXDK implements Subject{
     private List<Monitor> observers = new ArrayList<Monitor>();
    private float ruido;
    private int id;
 
    public ConcreteSubject_NoiseXDK (){}
    
    public ConcreteSubject_NoiseXDK (int id){
        this.id= id;
    }
    
    public ConcreteSubject_NoiseXDK (float rui) {
            this.ruido = rui;
    }
    
    public int getID(){
        return this.id;
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
         ConcreteObserver_NoiseXDK co = new ConcreteObserver_NoiseXDK();
         float ruido = getValue();
                    for (Monitor c : observers) {                      
                        System.out.println("###numero de NoiseMonitor " + c.getUser() + " - Sensor -" +  id + " - " + co.update(ruido) );
                        
                    }
    

    }

    @Override
    public void setValue(float value) {
        this.ruido = value;
    }

    @Override
    public float getValue() {
        float minA = 125.0f;
        float maxA = 4000.0f;
        
        Random randA = new Random();
        float ruido;
        ruido = randA.nextFloat() * ((maxA - minA) + minA) ;
        return ruido;
    }
    
}
