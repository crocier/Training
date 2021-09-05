package amazonQ1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Result {

	public static void main(String[] args) {
		
		List<Integer> parts = new ArrayList<>();
		parts.add(8);
		parts.add(4);
		parts.add(6);
		parts.add(12);
		
		int tot = combineParts(parts);
		System.out.println(tot);
	}

	private static int combineParts(List<Integer> parts) {
		int i = parts.size();
		if(i == 1)
		{
			return 0;
		}
		
		int j=0;
		
		List<Integer> sum = new ArrayList<Integer>();
		while(i>1) {
			parts.sort(Comparator.naturalOrder()); // 4,6,8,12 || 8,10,12 || 12,18
			int small = parts.get(0); //4 | 8 | 12
			int small2 = parts.get(1); //6 | 10 | 18
			sum.add(j,(small + small2) );// sum - 10 ,18 , 30 
			if(i!=2) {                                           
			parts.remove(0);                            // 6,8,12 || 10,12 || 18
			parts.remove(0);
			}                                             // 8,12 || 12 || 
			parts.add(sum.get(j));         // 8,12,10 || 12,18
			i--; //3 ,2
			j++; //1 ,2
			System.out.println(sum);
		}
		int total = 0;
		for(int k=0;k<sum.size();k++) {
			total = total + sum.get(k);
		}
		return total;
		
	}

}
