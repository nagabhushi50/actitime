package ARRAY1;

import java.util.Comparator;

public class SortByBrand implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Laptop l1=(Laptop)o1;
		Laptop l2=(Laptop)o2;
		
		return l1.brand.compareTo(l2.brand);

}
}