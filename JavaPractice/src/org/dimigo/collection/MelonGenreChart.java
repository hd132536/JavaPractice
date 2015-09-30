/**
 * 
 */
package org.dimigo.collection;

import java.util.*;
import java.util.Map.Entry;

/**
 * <pre>
 * org.dimigo.collection
 * |_ MelonGenreChart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> balad = new ArrayList<>();
		
		balad.add(new Music("Beautiful day", "하동균"));
		balad.add(new Music("또 다시 사랑", "임창정"));
		balad.add(new Music("내 것처럼", "베리굿"));

		map.put("발라드", balad);
		
		List<Music> dance = new ArrayList<>();
		dance.add(new Music("마법의 성", "MC 스나이퍼"));
		dance.add(new Music("HAPPY", "2NE1"));
		
		map.put("댄스", dance);
		
		System.out.println("----------<<멜론 장르별  차트>>-------------");
		printList(map);
		
		balad.set(2, new Music("지우고 지워도", "차수경"));
		System.out.println("----------<<발라드 3위곡 변경>>-------------");
		printList(map);
		
		balad.remove(0);
		System.out.println("----------<<발라드 1위곡 삭제>>-------------");
		printList(map);
		
		map.clear();
		System.out.println("----------<<전체 리스트 삭제>>-------------");
		printList(map);
		
	}

	public static void printList(Map<String, List<Music>> m) {
		for(Entry<String, List<Music>> entry : m.entrySet()) {
			System.out.println( "[" + entry.getKey() + "]");
			
			int i = 0;
			for(Music mm : entry.getValue()) {
				i++;
				System.out.print(i + ". ");
				System.out.println(mm);
			}
			
			System.out.println();
		}
	}
}
