package containDuplicate;

import java.util.HashSet;

public class ContainDuplicate {
	
	public boolean containDuplicateNumber(int a[]) {
		if(a.length==0 || a==null) {
			return false;
		}
		HashSet<Integer> h=new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			if(h.contains(a[i])) {
				return true;
			}
			else {
				h.add(i);
			}
		}
		return false;
	}

}
