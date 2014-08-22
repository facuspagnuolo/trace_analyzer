/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TraceAnalyzer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Trace implements Comparable<Trace>{
    private String nombre;
    private ArrayList<Integer> lru;
    public int count;
    
    public Trace(String n){
        this.nombre = n;
        this.lru = new ArrayList<Integer>();
        this.count = 0;
    }
    
    public String nombre(){
        return this.nombre;
    }
    
    public void nombre(String n){
        this.nombre = n;
    }
    
    public void addLRU(){
        this.lru.add(new Integer(this.count));
        this.count = -1;
    }
    
    public ArrayList<Integer> lru(){
        return lru;
    }
    
    ArrayList<Integer> lruSet() {
        ArrayList <Integer> result = new ArrayList();
        Iterator <Integer> iterator = lru.iterator();
        while(iterator.hasNext()){
            Integer i = iterator.next();
            if(!result.contains(i)) result.add(i);
        }
        Collections.sort(result);
        return result;
    }
    
    public int countLRU(int lru_distance){
        int countLRU = 0;
        Iterator <Integer> iterator = lru.iterator();
        while(iterator.hasNext()) if(iterator.next().intValue() == lru_distance) countLRU++;
        return countLRU;
    }
    
    public int minLRU(){
        if(!lru.isEmpty()) return Collections.min(lru);
        else return -1;
    }
    
    public int maxLRU(){
        if(!lru.isEmpty()) return Collections.max(lru);
        else return -1;
    }
    
    public int sumLRU(){
        int sum = 0;
        Iterator <Integer> iterator = lru.iterator();
        while(iterator.hasNext()) sum += iterator.next();
        return sum;
    }
    
    public double avgLRU(){
        return sumLRU()/(lru.size()/1.0);
    }

    @Override
    public int compareTo(Trace t){
        return nombre.compareTo(t.nombre());
    }
}
