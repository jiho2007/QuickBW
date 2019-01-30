package io.github.jiho2007.quickbw.data;

import java.util.HashMap;

public class Mode {
	
	public final HashMap<String, String> dict = new HashMap<String, String>();
	
	public Mode() {
		dict.put("1", "bedwars_eight_one");
		dict.put("2", "bedwars_eight_two");
		dict.put("3", "bedwars_four_three");
		dict.put("4", "bedwars_four_four");
		dict.put("5", "bedwars_eight_two_rush");
		dict.put("6", "bedwars_four_four_rush");
		dict.put("7", "bedwars_eight_two_ultimate");
		dict.put("8", "bedwars_four_four_ultimate");
		dict.put("9", "bedwars_capture");
		dict.put("0", "bedwars_castle");
	}
	
	public String getMode(String s) {
		return dict.get(s);
	}
	
}