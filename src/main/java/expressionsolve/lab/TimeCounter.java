package expressionsolve.lab;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Класс для подсчета времени выполнения методов коллекций  LinkedList и ArrayList
 * @author Стариков
 */
public class TimeCounter {
    LinkedList<String> list1 = new LinkedList<>();
    ArrayList<String> list2 = new ArrayList<>();

    /**
     * Подсчитывает время выполнения добавления count элементов в LinkedList.
     * @param count количество вызовов.
     */
    float addToLinkedList(int count)
    {
        String str="123";
        long start = System.nanoTime();
        for(int i=0;i<count;i++)
        {
        list1.add(str);
        }
       long end = System.nanoTime();

        return ((float)(end - start))/ 1000000;
    }

    /**
     * Подсчитывает время выполнения добавления count элементов в ArrayList.
     * @param count количество вызовов.
     */
    float addToArrayList(int count)
    {
        String str="123";
        long start = System.nanoTime();

        for(int i=0;i<count;i++)
        {
            list2.add(str);
        }
        long end = System.nanoTime();

        return ((float)(end - start))/ 1000000;
    }

    /**
     * Подсчитывает время выполнения получения count элементов из LinkedList.
     * @param count количество вызовов.
     */
    float getFromLinkedList(int count)
    {
        String str="";
        long start = System.nanoTime();
        for(int i=0;i<count;i++)
        {
          str= list1.get(i);
        }
        long end = System.nanoTime();

        return ((float)(end - start))/ 1000000;
    }

    /**
     * Подсчитывает время выполнения получения count элементов из ArrayList.
     * @param count количество вызовов.
     */
    float getFromArrayList(int count)
    {
        String str="";
        long start = System.nanoTime();
        for(int i=0;i<count;i++)
        {
            str= list2.get(i);
        }
        long end = System.nanoTime();

        return ((float)(end - start))/ 1000000;
    }
    /**
     * Подсчитывает время выполнения удаления count элементов из LinkedList.
     * @param count количество вызовов.
     */
    float removeFromLinkedList(int count)
    {
        String str="";
        long start = System.nanoTime();
        for(int i=0;i<count;i++)
        {
           str= list1.remove();
        }
        long end = System.nanoTime();

        return ((float)(end - start))/ 1000000;
    }

    /**
     * Подсчитывает время выполнения удаления count элементов из ArrayList.
     * @param count количество вызовов.
     */
    float removeFromArrayList(int count)
    {
        String str="";
        long start = System.nanoTime();
        for(int i=0;i<count;i++)
        {
             str= list2.remove(0);
        }
        long end = System.nanoTime();
        return ((float)(end - start))/ 1000000;
    }
    /**
     * Подсчитывает время count раз создания копии LinkedList.
     * @param count количество вызовов.
     */
    float cloneLinkedList(int count)
    {
        long start = System.nanoTime();
        for(int i=0;i<count;i++)
        {
            list1.clone();
        }
        long end = System.nanoTime();

        return ((float)(end - start))/ 1000000;
    }
    /**
     * Подсчитывает время count раз создания копии ArrayList.
     * @param count количество вызовов.
     */
    float cloneArrayList(int count)
    {
        long start = System.nanoTime();
        for(int i=0;i<count;i++)
        {
             list2.clone();
        }
        long end = System.nanoTime();
        return ((float)(end - start))/ 1000000;
    }
    /**
     * Подсчитывает время count раз сравнения двух LinkedList.
     * @param count количество вызовов.
     */
    float equalsLinkedList(int count)
    {
        LinkedList<String> tmplist = new LinkedList<>();
        tmplist=list1;
        long start = System.nanoTime();
        for(int i=0;i<count;i++)
        {
            list1.equals(tmplist);
        }
        long end = System.nanoTime();

        return ((float)(end - start))/ 1000000;
    }
    /**
     * Подсчитывает время count раз сравнения двух ArrayList.
     * @param count количество вызовов.
     */
    float equalsArrayList(int count)
    {
        ArrayList<String> tmplist = new ArrayList<>();
        tmplist=list2;
        long start = System.nanoTime();
        for(int i=0;i<count;i++)
        {
            list2.equals(tmplist);
        }
        long end = System.nanoTime();
        return ((float)(end - start))/ 1000000;
    }
}

