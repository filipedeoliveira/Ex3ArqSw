/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as_ex1;

import java.util.ArrayList;
import java.util.List;


public class Main {
    private static List<Cliente> clientes1 = new ArrayList(); 
    private static List<Cliente> clientes2 = new ArrayList();   
    
    
    public static void main(String args[]) {
        int i;
        for (i = 0; i < 5; i++) {
            clientes1.add(new Cliente(i));
        }

        for (i = 5; i < 10; i++) {
            clientes2.add(new Cliente(i));
        }

        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    for (Cliente c : clientes1) {
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {;
                        }
                    }
                }
            }
        }).start();
    }
   
}
