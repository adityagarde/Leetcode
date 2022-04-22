package com.github.aditya;

import java.util.LinkedList;

public class _0706 {
    // 16 ms, faster than 92.13%, memory 48.6 MB, less than 89.92%
    class MyHashMap {
        public static int SIZE = 809;
        LinkedList<Entry>[] map;

        public MyHashMap() {
            map = new LinkedList[SIZE];
        }

        public void put(int key, int value) {
            int index = key % SIZE;
            if (map[index] == null) {
                map[index] = new LinkedList<>();
                map[index].add(new Entry(key, value));
            } else {
                for (Entry entry : map[index]) {
                    if (entry.key == key) {
                        entry.value = value;
                        return;
                    }
                }
                map[index].add(new Entry(key, value));
            }
        }

        public int get(int key) {
            int index = key % SIZE;
            LinkedList<Entry> childList = map[index];
            if (childList == null) return -1;
            for (Entry entry : childList) {
                if (entry.key == key)
                    return entry.value;
            }
            return -1;
        }

        public void remove(int key) {
            int index = key % SIZE;
            if (map[index] == null) return;
            Entry removeObj = null;
            for (Entry entry : map[index]) {
                if (entry.key == key)
                    removeObj = entry;
            }
            if (removeObj == null) return;
            map[index].remove(removeObj);
        }

        private class Entry {
            public int key;
            public int value;

            public Entry(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }
    }

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
}