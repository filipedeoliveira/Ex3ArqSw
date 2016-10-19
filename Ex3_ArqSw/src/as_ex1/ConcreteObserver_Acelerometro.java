
package as_ex1;

public class ConcreteObserver_Acelerometro extends Monitor implements Observer{

   
    public ConcreteObserver_Acelerometro(int user) {
        super(user);
    }

    @Override
    public void update(float value) {
        
        System.out.println( "Monitor" + getUser() + " A aceleração atual é " + value + " g");
        }
    
    
    }
    
   