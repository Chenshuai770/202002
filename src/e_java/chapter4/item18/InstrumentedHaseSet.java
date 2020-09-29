package e_java.chapter4.item18;

import java.util.HashSet;

/**
 * FileName: InstrumentedHaseSet
 * Date: 2020/9/29 14:22
 * Author:cs
 * Description:
 */
public class InstrumentedHaseSet<E> extends HashSet {
    private int addCount = 0;

    /**
     * Constructs a new, empty set; the backing <tt>HashMap</tt> instance has
     * default initial capacity (16) and load factor (0.75).
     */
    public InstrumentedHaseSet() {
    }
}
