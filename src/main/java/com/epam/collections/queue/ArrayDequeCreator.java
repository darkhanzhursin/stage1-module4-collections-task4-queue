package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // both take turns adding two cards to the ArrayDeque<Integer>
        for (int i = 0; i < 2; i++) {
            arrayDeque.add(firstQueue.remove());
        }
        for (int i = 0; i < 2; i++) {
            arrayDeque.add(secondQueue.remove());
        }

        //takes the top card from the ArrayDeque<Integer> and adds this card to the end of his Queue<Integer>
        //then puts two cards from the beginning of his Queue<Integer> into the ArrayDeque<Integer>
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(arrayDeque.removeLast());
            for (int i = 0; i < 2; i++) {
                arrayDeque.addLast(firstQueue.remove());
            }
            secondQueue.add(arrayDeque.removeLast());
            for (int i = 0; i < 2; i++) {
                arrayDeque.addLast(secondQueue.remove());
            }
        }

        return arrayDeque;
    }
}
