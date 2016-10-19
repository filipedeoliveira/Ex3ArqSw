
package as_ex1;


public class ConcreteObserver_Temp extends Monitor implements Observer {

   
    public ConcreteObserver_Temp(int user) {
        super(user);
    }
    
    @Override
    public void update(float temp) {

        System.out.println(">>Monitor" + getUser() +  " A temperatura atual é " + temp + " ºC");
    }

}
