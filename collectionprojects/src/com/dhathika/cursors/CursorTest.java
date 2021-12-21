package  com.dhathika.cursors;

import java.util.Iterator;
import java.util.List;

public class CursorTest {

	public void arrayListPerformance(List list) {
		
		
		Iterator ali = list.iterator();
		while(ali.hasNext())
			System.out.println(ali.next());
			
		
	}
	public void linkedListPerformance(List list) {
	
		Iterator lli = list.iterator();
		while(lli.hasNext())
			System.out.println(lli.next());
		

	}
		
}