/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as_ex1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


class ConcreteObserver_NoiseXDK extends Monitor implements Observer {

    public ConcreteObserver_NoiseXDK(int user) {
        super(user);
    }
    
    @Override
    public void update(float value) {
        String ruido = Float.toString(value);
              
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date hora = Calendar.getInstance().getTime(); // Ou qualquer outra forma que tem
        String dataFormatada = sdf.format(hora);
        
        //ConcreteSubject_NoiseXDK aux = new ConcreteSubject_NoiseXDK ();

        System.out.println( "###NoiseMonitor - " + getUser() + " Sensor NoiseXDK "  + "(" + dataFormatada + ") " + ruido + " dB");

    }

}
