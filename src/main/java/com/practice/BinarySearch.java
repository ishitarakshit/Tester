package com.practice;


public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 7, 8, 9};
        
        int toSearch = 5;
        
        boolean found = search(a, toSearch);
        System.out.println(found);
    }

    private static boolean search(int[] a, int toSearch) {
        int min = 0;
        int max = a.length - 1;
        
        
        return isPresent(a, min, max, toSearch);
    }

    private static boolean isPresent(int[] a, int min, int max, int toSearch) {
        int mid = (max - min)/2;
        
        if (mid == 0) return false;
        
        if (toSearch < a[min+mid]) {
            return isPresent(a, min, mid, toSearch);
        } else if (toSearch > a[min+mid]) {
            return isPresent(a, mid, max, toSearch);
        } else {
            return true;
        }
    }
    
}
