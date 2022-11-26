package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishes = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }

        int step = everyDishNumberToEat - 1;
        int i = 0;
        while (!dishes.isEmpty()) {
            i = (i + step) % dishes.size();
            int n = dishes.remove(i);
            result.add(n);
        }

        return result;
    }
}
