
package as_ex1;

public interface Subject { 
    public void registerObserver(Monitor cli);
    public void removeObserver(Monitor cli);
    public void notifyObservers(); 

    public void setValue(float value);
    public float getValue();
}
