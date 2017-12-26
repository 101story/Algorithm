package com.jin.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatoAge {

	public static void main(String[] args) {
		ArrayList<Player> playlist = new ArrayList<Player>();

		Player ply1 = new Player("가나", "공격", 21);
		Player ply2 = new Player("나다", "방어", 30);
		Player ply3 = new Player("라라", "공격", 21);
		Player ply4 = new Player("라누", "방어", 24);
		Player ply5 = new Player("바수", "공격", 27);

		playlist.add(ply1);
		playlist.add(ply2);
		playlist.add(ply3);
		playlist.add(ply4);
		playlist.add(ply5);

		Collections.sort(playlist, new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {
				if(o1.getAge() > o2.getAge()) {
					return 1;
				}else if(o1.getAge() < o2.getAge()) {
					return -1;
				}else {
					return 0;
				}
			}

		});
		
		for(Player p : playlist) {
			System.out.println(p.getName()+p.getAge());
		}
	}

}
