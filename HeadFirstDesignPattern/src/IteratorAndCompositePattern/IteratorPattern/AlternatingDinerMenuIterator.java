package IteratorAndCompositePattern.IteratorPattern;

import java.util.*;

/**
 * Created by SkywingWang on 17/2/12.
 */
public class AlternatingDinerMenuIterator implements java.util.Iterator {
    MenuItem[] items;
    int position = 0;
    public AlternatingDinerMenuIterator(MenuItem[] items){
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;

    }
    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Alternating diner Menu Iterator does not support remove()");
    }
}
