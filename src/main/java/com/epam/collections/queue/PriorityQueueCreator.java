package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {

        PriorityQueue<String> priorityQueue =
            new PriorityQueue<>(new Comparator<String>() {
                @Override public int compare(final String o1, final String o2) {
                    return -o1.compareTo(o2);
                }
            });

        Iterator<String> iterator1 = firstList.iterator();

        while (iterator1.hasNext()) {
            priorityQueue.add(iterator1.next());
        }

        iterator1 = secondList.iterator();
        while (iterator1.hasNext()) {
            priorityQueue.add(iterator1.next());
        }

        return priorityQueue;
    }
}
