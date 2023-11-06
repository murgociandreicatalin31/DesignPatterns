package ro.ctrln.observer;

public class FactoryProcess {

    public static void main(String[] args) {

        FactoryStock factoryStockOne = new FactoryStock(); // observer
        FactoryStock factoryStockTwo = new FactoryStock(); // observer
        FactoryWorker factoryWorker = new FactoryWorker(); // observable

        factoryWorker.addObserver(factoryStockOne);
        factoryWorker.addObserver(factoryStockTwo);
        factoryWorker.setStockLevel(100);
        // when the stock level is set on the factory worker, the factory worker notifies the two observers that the stock level has changed

        System.out.println(factoryStockOne.getStockLevel() == 100);
        System.out.println(factoryStockTwo.getStockLevel() == 100);
    }
}
