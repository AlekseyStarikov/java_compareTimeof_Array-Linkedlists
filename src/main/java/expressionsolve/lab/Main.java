package expressionsolve.lab;


public class Main {
    public static void main(String[] args) {

        int count =20000;
        TimeCounter time=new TimeCounter();
        System.out.println("method add()");
        System.out.println("LinkedList\t"+"вызван\t"+count+"раз\t"+time.addToLinkedList(count)+"ms");
        System.out.println("ArrayList\t"+"вызван\t"+count+"раз\t"+time.addToArrayList(count)+"ms");
        System.out.println("method get()");
        System.out.println("LinkedList\t"+"вызван\t"+count+"раз\t"+time.getFromLinkedList(count)+"ms");
        System.out.println("ArrayList\t"+"вызван\t"+count+"раз\t"+time.getFromArrayList(count)+"ms");
        System.out.println("method equals()");
        System.out.println("LinkedList\t"+"вызван\t"+count+"раз\t"+time.equalsLinkedList(count)+"ms");
        System.out.println("ArrayList\t"+"вызван\t"+count+"раз\t"+time.equalsArrayList(count)+"ms");
        System.out.println("method clone()");
        System.out.println("LinkedList\t"+"вызван\t"+count+"раз\t"+time.cloneLinkedList(count)+"ms");
        System.out.println("ArrayList\t"+"вызван\t"+count+"раз\t"+time.cloneArrayList(count)+"ms");
        System.out.println("method remove()");
        System.out.println("LinkedList\t"+"вызван\t"+count+"раз\t"+time.removeFromLinkedList(count)+"ms");
        System.out.println("ArrayList\t"+"вызван\t"+count+"раз\t"+time.removeFromArrayList(count)+"ms");
    }
}
