package controllers;

import java.util.*;

import shapes.Polygon;

public class InsertionSortController extends Controller {  
    public void sort(Comparable[] items, Comparator comparator) { 
    	for (int i =0; i < items.length; i++) {
    		Polygon current = (Polygon) items[i];
			int j = i-1;
			while (j >=0 && comparator.compare(items[j], items[j + 1]) == 1) {
				items[j+1] = items[j];
				j--;
			}
			items[j+1] = current;
		} 
    } 
}