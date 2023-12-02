package expressionsolve.lab;


public class Main {
    public static void main(String[] args) {

        int count =20000;
        TimeCounter time=new TimeCounter();
        System.out.println("method add()");
        System.out.println("LinkedList\t"+time.addToLinkedList(count)+"ms");
        System.out.println("ArrayList\t"+time.addToArrayList(count)+"ms");
        System.out.println("method get()");
        System.out.println("LinkedList\t"+time.getFromLinkedList(count)+"ms");
        System.out.println("ArrayList\t"+time.getFromArrayList(count)+"ms");
        System.out.println("method equals()");
        System.out.println("LinkedList\t"+time.equalsLinkedList(count)+"ms");
        System.out.println("ArrayList\t"+time.equalsArrayList(count)+"ms");
        System.out.println("method clone()");
        System.out.println("LinkedList\t"+time.cloneLinkedList(count)+"ms");
        System.out.println("ArrayList\t"+time.cloneArrayList(count)+"ms");
        System.out.println("method remove()");
        System.out.println("LinkedList\t"+time.removeFromLinkedList(count)+"ms");
        System.out.println("ArrayList\t"+time.removeFromArrayList(count)+"ms");
    }
}
