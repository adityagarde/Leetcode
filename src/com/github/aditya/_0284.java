package com.github.aditya;

import java.util.Iterator;

public class _0284 {
    // 4 ms, faster than 87.52%, memory 41.8 MB, less than 97.68%
    class PeekingIterator implements Iterator<Integer> {
        private Iterator<Integer> iterator = null;
        private Integer nextValue = null;

        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            this.iterator = iterator;
            if (hasNext())
                nextValue = iterator.next();
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return nextValue;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer currentValue = nextValue;
            if (iterator.hasNext())
                nextValue = iterator.next();
            else
                nextValue = null;

            return currentValue;
        }

        @Override
        public boolean hasNext() {
            return nextValue != null || iterator.hasNext();
        }
    }
}