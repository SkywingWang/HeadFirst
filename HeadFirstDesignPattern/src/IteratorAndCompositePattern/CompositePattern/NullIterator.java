package IteratorAndCompositePattern.CompositePattern;

import java.util.Iterator;

/**
 * Created by SkywingWang on 17/2/12.
 */
public class NullIterator implements Iterator {
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
