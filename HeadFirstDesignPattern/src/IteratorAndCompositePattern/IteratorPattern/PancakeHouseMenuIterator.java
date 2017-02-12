package IteratorAndCompositePattern.IteratorPattern;

import java.util.*;

/**
 * Created by SkywingWang on 17/2/12.
 */
public class PancakeHouseMenuIterator implements java.util.Iterator {
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems){
        this.menuItems = menuItems;
    }
    @Override
    public boolean hasNext() {
        if(position >= menuItems.size() || menuItems.get(position) == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
