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
public class ConcreteObserver implements Observer {

    @Override
    public void update(float novoValor) {
        if (novoValor > 100) {  /*so pra testar versão final verificar se novo valor diferente do valor q la estava antes)*/
            System.out.println("bla bla bla "+ novoValor);
        }
    }
   
}