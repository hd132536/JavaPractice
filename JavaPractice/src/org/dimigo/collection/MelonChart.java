/**
 * 
 */
package org.dimigo.collection;

import java.util.*;

/**
 * <pre>
 * org.dimigo.collection
 * |_ MelonChart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author		: 한수지
 * @vision		: 1.0
 */
public class MelonChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("바람이나 좀 쐐", "강개리"));
		list.add(new Music("보통연애", "박경"));
		list.add(new Music("취향저격", "IKON"));
		
		System.out.println("--<멜론 챠트>>--");
		printList(list);
		
		list.add(1, new Music("레옹", "이유갓지"));
		System.out.println("--<<2위곡 추가>>--");
		printList(list);

		list.set(2, new Music("맙소사", "황태지"));
		System.out.println("--<<3위곡 변경>>--");
		printList(list);
		
		list.remove(3);
		System.out.println("--<<4위곡 삭제>>--");
		printList(list);
		
		list.clear();
		System.out.println("--<<전체 삭제>>--");
		printList(list);
		
	}
	
	public static void printList(List<Music> list) {
		int i = 0;
		for(Music m : list) {
			i++;
			System.out.print(i + ". ");
			System.out.println(m);
		}
		System.out.println();
	}

}
