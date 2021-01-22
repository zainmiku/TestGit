package cn.fanhoufang;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class MapToJOSN {
	@Test
	public void test01() {
		Map<String,Object> map = new HashMap<>();
	    map.put("age", 11);
	    map.put("age", 15);
	    map.put("name", "cool_summer_moon");
	    map.put("name", "T");
	    System.out.println(map.toString());
	}
//	@Test
	public void testMaxArea() {
		int[] arr = {2,6,19,5,7,8,0};
		System.out.println(MaxArea.maxArea(arr));
	}

}
