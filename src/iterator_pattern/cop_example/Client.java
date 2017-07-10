package iterator_pattern.cop_example;

/**
 * Created by cuikangyuan on 2017/7/10.
 */
public class Client {

    private void op() {
        PurchaseOfCopA purchaseOfCopA = new PurchaseOfCopA();


        purchaseOfCopA.append(1);
        purchaseOfCopA.append(2);
        purchaseOfCopA.append(3);
        purchaseOfCopA.append(4);
        purchaseOfCopA.append(5);

        Iterator iterator = purchaseOfCopA.createIterator();
        iterator.first();
        while (!iterator.isDone()) {
            System.out.println("" + iterator.currentItem());

            iterator.next();
        }


        System.out.println("=============================");

        PurchaseOfCopB purchaseOfCopB = new PurchaseOfCopB();


        purchaseOfCopB.append(1);
        purchaseOfCopB.append(2);
        purchaseOfCopB.append(3);
        purchaseOfCopB.append(4);
        purchaseOfCopB.append(5);

        Iterator purchaseOfCopBIterator = purchaseOfCopB.createIterator();
        purchaseOfCopBIterator.first();
        while (!purchaseOfCopBIterator.isDone()) {
            System.out.println("" + purchaseOfCopBIterator.currentItem());

            purchaseOfCopBIterator.next();
        }


    }

    public static void main(String[] args) {
        new Client().op();
    }
}
