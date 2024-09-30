package org.example.d堆_栈_队列;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class d6寻找第K大 {

    public int findKth(int[] a, int n, int K) {
        Arrays.sort(a);
        return a[n - K];
    }
}
