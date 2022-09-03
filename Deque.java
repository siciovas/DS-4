package com.company;

public interface Deque<E> {

    //Inserts item in the beginning
    void offerFirst(E item);

    //Deletes first item
    void pollFirst();

    //Gets and returns the first item in the deque
    E peakFirst();

    // --------------------------------------------------------------------------------

    //Inserts item in the end
    void offerLast(E item);

    //Deletes last item
    void pollLast();

    //Gets and returns the last item in the deque
    E peakLast();

    // --------------------------------------------------------------------------------

    //Checks if deque is full
    boolean isFull();

    //Makes deque bigger two times
    E[] makeDequeBigger(E[] e);
}
