
package as_ex1;

public class ConcreteObserver_Acelerometro implements Observer{

    @Override
    public String update(float value) {
        return " A acelaração atual é " + value + " g";
        }
    
    
    }
    
   