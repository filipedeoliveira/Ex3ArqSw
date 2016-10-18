/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as_ex1;

/**
 *
 * @author Stéphane
 */
public interface Subject { 
    public void registerObserver(Cliente cli);
    public void removeObserver(Cliente cli);
    public void notifyObservers(); 

    public void setValue(float value);
    public float getValue();
}
