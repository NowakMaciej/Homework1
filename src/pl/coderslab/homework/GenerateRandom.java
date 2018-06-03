package pl.coderslab.homework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {
	public static void main(String[] args) {
		Map<Integer, Integer> map = checkRand(10, 5);
		System.out.println("---WYNIK KOŃCOWY---");
		for (int i=0; i<map.size(); i++) {
			System.out.println(i + " : " + map.get(i));
		}
	}
	
	public static  Map<Integer, Integer> checkRand(int amount, int interval) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		Random rand = new Random();
		for (int i=0; i<amount; i++) {
			int result = rand.nextInt(interval);
			list.add(result);
		} 
		Collections.sort(list);
		for (int i=0; i<interval; i++) {
			list2.add(Collections.frequency(list, i));
			map.put(i, list2.get(i));
		}			
		System.out.println("---WYNIK LOSOWANIA (POSORTOWANY)---");
		System.out.println(list);
		System.out.println("---LICZBA WYSTĄPIEŃ POSZCZEGÓLNYCH LICZB (0-INTERVAL)---");
		System.out.println(list2);
		return map;
	}
}
