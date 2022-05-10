public class Main {
    public static void main(String[] args) throws InterruptedException {
        CarsPark carsPark = new CarsPark();
        Thread diler = new Diler(carsPark);
        diler.start();
        Thread buyer1 = new Buyer(carsPark, "Покупатель 1");
        buyer1.start();
        Thread buyer2 = new Buyer(carsPark, "Покупатель 2");
        buyer2.start();
        Thread buyer3 = new Buyer(carsPark, "Покупатель 3");
        buyer3.start();
        Thread buyer4 = new Buyer(carsPark, "Покупатель 4");
        buyer4.start();

    }
}
