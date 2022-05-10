public class Diler extends Thread{
    CarsPark carsPark;
    Diler(CarsPark carsPark){
        this.carsPark=carsPark;
    }
    @Override
    public void run(){
        for (int i = 1; i < 10; i++) {
            carsPark.put();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
