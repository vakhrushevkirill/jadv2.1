import java.security.cert.TrustAnchor;

public class Buyer extends Thread{
    CarsPark carsPark;
    String name;
    Buyer(CarsPark carsPark, String name){
        this.carsPark = carsPark;
        this.name = name;
    }

    @Override
    public void run(){
        for (int i = 1; i < 3; i++) {
            carsPark.get();
            System.out.println(name + " уехал на новеньком авто");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
