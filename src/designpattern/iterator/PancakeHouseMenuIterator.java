package designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }
    public MenuItem next() {
        MenuItem item = items.get(position);
        position = position + 1;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Can’t delete menu items.");
    }

    public boolean hasNext() {
        if (position >= items.size())
            return false;
        else
            return true;
    }
}
