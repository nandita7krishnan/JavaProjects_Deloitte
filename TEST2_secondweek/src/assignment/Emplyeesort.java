package assignment;

import java.util.Comparator;

public class Emplyeesort implements Comparator<EmplyeeVo>{

	
	
	@Override
	public int compare(EmplyeeVo o1, EmplyeeVo o2) {
		return (int) (o2.getIncometax() - o1.getIncometax());	
		}	
	
}