package iteratorpattern;

import java.util.List;

public class BreakfastMenuIterator implements Iterator {
    List<MenuItem> menuItems;
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
