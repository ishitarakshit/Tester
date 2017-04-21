package com.practice;
import java.util.*;


public class TowerOfHanoi {

    private static List<String> moves = new ArrayList<String>();
    
    public static List<String> transferFromAtoC(int n) {
        moveTower(n, "A", "C", "B");
        
        return moves;
    }
    

    private static void moveTower(int numDisks, String start, String end, String temp) {
        if (numDisks ==1) {
            moveSingleDisk(start,end);
        }
        else {
            moveTower (numDisks-1, start, temp, end);
            moveSingleDisk (start, end);
            moveTower (numDisks-1, temp, end, start);
        }
    }

    private static void moveSingleDisk(String start, String end) {
        moves.add(start+end);
    }

    
    public static void main(String[] args) {
        System.out.println("moves: "+TowerOfHanoi.transferFromAtoC(3));
    }
    
}