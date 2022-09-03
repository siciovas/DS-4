package com.company;
import java.util.Iterator;

public class DequeCycleArray<E> implements  Deque<E>, Iterable<E>
{

    private E[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public DequeCycleArray()
    {
        array = (E[]) new Object[16];
        size = 0;
        front = -1;
        rear = 0;
        capacity = 16;
    }

    //Time complexity O(1)
    //Inserts item in the beginning
    @Override
    public void offerFirst(E item) {
        // Checks if deque is full, if true makes deque bigger two times
        if(isFull())
        {
            array = makeDequeBigger(array);
        }

        // Checks if deque is empty
        if(front == -1)
        {
            front = 0;
            rear = 0;
        }

        // Moves front to rear
        else if(front == 0)
        {
            front = capacity - 1;
        }

        // Moves back
        else
        {
            front = front - 1;
        }

        // Puts item in deque front
        array[front] = item;
        size++;
    }

    //Time complexity O(1)
    //Deletes first item
    @Override
    public void pollFirst()
    {
        //Checks if deque is empty
        if(size == 0)
        {
            System.out.println("Deque is empty, item will not be deleted");
        }

        //Checks if there is only one item in the deque
        if(front == rear)
        {
            front = -1;
            rear = -1;
        }

        else
        {
            // If front shows to the last index, so we put front at the first index of array
            if(front == capacity - 1)
            {
                front = 0;
            }
            //Front is pushed, to delete first item from the front
            else {
                front = front + 1;
            }
        }

        size--;
    }

    //Time complexity O(1)
    //Gets and returns the first item in the deque
    @Override
    public E peakFirst() {
        return array[front];
    }

    //Time complexity O(1)
    //Inserts item in the end
    @Override
    public void offerLast(E item){
        //Checks if deque is full, if yes makes it two times bigger
        if(isFull())
        {
            array = makeDequeBigger(array);
        }

        //Checks if deque is empty
        if(front == -1)
        {
            front = 0;
            rear = 0;
        }

        //Moves rear to front
        else if(rear == capacity - 1)
        {
            rear = 0;
        }
        //Pushes rear one place forward
        else{
            rear = rear + 1;
        }

        //Puts new item in the deque
        array[rear] = item;
        size++;

    }

    //Time complexity O(1)
    //Deletes last item
    @Override
    public void pollLast() {

        //Checks if deque is empty
        if(size == 0)
        {
            System.out.println("Deque is empty, item will not be deleted");
        }

        //Checks if deque has only one element
        if(front == rear)
        {
            front = -1;
            rear = -1;
        }

        else
        {
            //Rear is at the 0th index of array, it's means we have to move rear to points
            if(rear == 0)
            {
                rear = capacity - 1;
            }
            //Rear is pushed, to delete last item from the rear
            else {
                rear = rear - 1;
            }
        }

        size--;

    }

    //Time complexity O(1)
    //Gets and returns the last item in the deque
    @Override
    public E peakLast() {
        return array[rear];
    }

    //Time complexity O(1)
    //Checks if deque is full
    @Override
    public boolean isFull() {
        return size == capacity;
    }

    //Time complexity O(n)
    @Override
    public E[] makeDequeBigger(E[] e)
    {
        E[] newE = (E[]) new Object[capacity*2]; //Creates a duplicate array which is two times bigger
        Iterator<E> iterator = iterator();  //Creates an iterator

        for(int i = 0; i < capacity; i++)
        {
            newE[i] = iterator.next(); // in the i-th place of the new array puts each element from the old deque in a row
        }

        front = 0; //0th index in the array
        rear = capacity - 1; //Rear shows to the last item
        capacity = capacity*2; // Makes deque two times bigger

        return newE;
    }


    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>(){

            int current = front;
            int count = 0;
            //Checks if its not the last item in deque
            @Override
            public boolean hasNext() {
                if(current <= rear)
                    return true;
                if(isFull())
                    return count < capacity;
                if (current <= rear ||  current >= front)
                {
                    return true;
                }
                return false;
            }

            //Moves to the next item
            @Override
            public E next() {
                if (hasNext()) {
                    count++;
                    E elem = array[current];
                    if(current == capacity-1)
                    {
                        current = 0;
                    }
                    else current++;
                    return elem;
                }

                return null;
            }
        };
    }
}
