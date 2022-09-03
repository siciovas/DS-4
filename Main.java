package com.company;
import java.util.*;

public class Main {

    public static void main(String... args) {

        DequeCycleArray<Integer> deque = new DequeCycleArray<>();

        System.out.println("offerFirst(E element) ir peakFirst() testavimas");
        deque.offerFirst(1);
        System.out.println(deque.peakFirst());
        deque.offerFirst(2);
        System.out.println(deque.peakFirst());
        deque.offerFirst(3);
        System.out.println(deque.peakFirst());
        deque.offerFirst(4);
        System.out.println(deque.peakFirst());

        // ------------------------------------------------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------------------------------------------------");

        System.out.println("offerLast(E element) ir peakLast() testavimas");
        deque.offerLast(5);
        System.out.println(deque.peakLast());
        deque.offerLast(6);
        System.out.println(deque.peakLast());
        deque.offerLast(7);
        System.out.println(deque.peakLast());
        deque.offerLast(8);
        System.out.println(deque.peakLast());

        // ------------------------------------------------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------------------------------------------------");

        System.out.println("Iteratoriaus testavimas");
        Iterator<Integer> iterator = deque.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
        System.out.println("");

        // ------------------------------------------------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------------------------------------------------");

        System.out.println("pollFirst() testavimas");
        deque.pollFirst();
        System.out.println(deque.peakFirst());
        deque.pollFirst();
        System.out.println(deque.peakFirst());

        // ------------------------------------------------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------------------------------------------------");

        System.out.println("pollLast() testavimas");
        deque.pollLast();
        System.out.println(deque.peakLast());
        deque.pollLast();
        System.out.println(deque.peakLast());

        // ------------------------------------------------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------------------------------------------------");

        deque.offerFirst(0);
        deque.offerFirst(0);
        deque.offerFirst(0);
        deque.offerFirst(0);
        deque.offerFirst(0);
        deque.offerFirst(0);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);
        deque.offerFirst(1);


        System.out.println("Iteratoriaus testavimas");

        Iterator<Integer> iterator2 = deque.iterator();

        while(iterator2.hasNext())
        {
            System.out.print(iterator2.next()+" ");
        }
    }
}