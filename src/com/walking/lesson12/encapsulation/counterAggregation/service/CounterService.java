package com.walking.lesson12.encapsulation.counterAggregation.service;

import com.walking.lesson12.encapsulation.counterAggregation.model.Counter;

public class CounterService {
    private Counter[] counters;

    public CounterService(Counter... counters) {
        this.counters = counters;
    }

    public Counter[] getAllCounters() {
        return counters;
    }

    public Counter getCounterName(String name) {
        for (Counter counter : counters) {
            if (counter.getName().equals(name)) {
                return counter;
            }
        }
        return null;
    }

    public Counter incrementCounter(String name) {
        Counter counter = getCounterName(name);

        if (counter == null) {
            return null;
        }

        return incrementCounter(counter);
    }

    public Counter incrementCounter(Counter counter) {
        increaseCounter(counter, 1);

        return counter;
    }

    public Counter decrementCounter(String name) {
        Counter counter = getCounterName(name);

        if (counter == null) {
            return null;
        }

        return decrementCounter(counter);
    }

    public Counter decrementCounter(Counter counter) {
        decreaseCounter(counter, 1);

        return counter;
    }

    public Counter increaseCounter(String name, int value) {
        Counter counter = getCounterName(name);

        if (counter == null) {
            return null;
        }

        return increaseCounter(counter, value);
    }

    public Counter increaseCounter(Counter counter, int value) {
        counter.setValue(counter.getValue() + value);

        return counter;
    }

    public Counter decreaseCounter(String name, int value) {
        Counter counter = getCounterName(name);

        if (counter == null) {
            return null;
        }

        return decreaseCounter(counter, value);
    }

    public Counter decreaseCounter(Counter counter, int value) {
        counter.setValue(counter.getValue() - value);

        return counter;
    }

    public Counter resetCounter(String name) {
        Counter counter = getCounterName(name);

        if (counter == null) {
            return null;
        }

        return resetCounter(counter);
    }

    public Counter resetCounter(Counter counter) {
        counter.setValue(0);

        return counter;
    }
}
