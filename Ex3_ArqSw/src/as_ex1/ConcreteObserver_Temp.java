
package as_ex1;


public class ConcreteObserver_Temp implements Observer {

    public ConcreteObserver_Temp() {
    }

    @Override
    public String update(float temp) {

        return " A temperatura atual é " + temp + " ºC";
    }

}
