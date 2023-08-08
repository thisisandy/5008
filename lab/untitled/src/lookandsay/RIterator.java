package lookandsay;

import java.util.Iterator;

// Define RIterator interface
public interface RIterator<T> extends Iterator<T> {
    T prev();
    boolean hasPrevious();
}

