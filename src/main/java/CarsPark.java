public class CarsPark {
    private int cars = 0;
    public synchronized void get() {
        while (cars < 1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        cars--;
        System.out.println("Машин в парке нет");
        notify();
    }
    public synchronized void put() {
        while (cars>=10) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        cars++;
        System.out.println("Производитель выпустил 1 авто");
        notify();
    }
}
