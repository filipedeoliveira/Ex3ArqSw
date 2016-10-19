
package as_ex1;

public class MAIN {
        public static void main(String args[]) {

        ConcreteSubject_Acelerometro xdk_acel = new ConcreteSubject_Acelerometro();
        ConcreteSubject_Temp xdk_temp = new ConcreteSubject_Temp();
        ConcreteSubject_NoiseXDK xdk_noise1 = new ConcreteSubject_NoiseXDK (1);
        ConcreteSubject_NoiseXDK xdk_noise2 = new ConcreteSubject_NoiseXDK (2);
        ConcreteSubject_NoiseXDK xdk_noise3 = new ConcreteSubject_NoiseXDK (3);
        
        int i;
       for (i = 1; i < 3; i++) {
            xdk_temp.registerObserver(new Monitor(i));
            xdk_acel.registerObserver(new Monitor(i));
            xdk_noise1.registerObserver(new NoiseMonitor(i));
            xdk_noise2.registerObserver(new NoiseMonitor(i));
            xdk_noise3.registerObserver(new NoiseMonitor(i));
        }
       
       
        System.out.println("Clientes ligados ao XDK \n");
        
        
    
        new Thread( new Runnable(){
            public void run() {
            while (true) {
                xdk_temp.notifyObservers();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                System.out.println("ERRO");
            }
        }}}).start();
        
        new Thread( new Runnable(){
            public void run() {
            while (true) {
                xdk_acel.notifyObservers();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("ERRO");
            }
        }}}).start();

        new Thread( new Runnable(){
            public void run() {
            while (true) {
                xdk_noise1.notifyObservers();
                xdk_noise2.notifyObservers();
                xdk_noise3.notifyObservers();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException ex) {
                System.out.println("ERRO");
            }
        }}}).start();
    
      
        }
}
