package com.example.iterable;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Bag<T> implements Container<T> {
    private List<T> items;

    public Bag() {
        items = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void add(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }
}
