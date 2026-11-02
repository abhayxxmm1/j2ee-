package co.vinod.model.d1;

import co.vinod.model.d1.CusAL;

public class ALDriver {

	public static void main(String[] args) {

		// Create custom ArrayList
		ListADT<Integer> list = new CusAL<>();

		// 1. Test isEmpty()
		System.out.println("Is Empty: " + list.isEmpty());

		// 2. Test capacity()
		System.out.println("Initial Capacity: " + list.capacity());

		// 3. Test add(E data)
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println("\nAfter adding elements:");
		System.out.println(list);

		// 4. Test ensureCapacity()
		list.add(60);
		System.out.println("\nAfter adding 60 (Capacity Expansion):");
		System.out.println(list);
		System.out.println("Capacity: " + list.capacity());

		// 5. Test add(index, data)
		list.add(2, 25);
		System.out.println("\nAfter inserting 25 at index 2:");
		System.out.println(list);

		// 6. Test get(index)
		System.out.println("\nElement at index 3: " + list.get(3));

		// 7. Test remove(E data)
		Integer removed = list.remove(30);
		System.out.println("\nRemoved element: " + removed);
		System.out.println("After remove(30): " + list);

		// 8. Test delete(index)
		Integer deleted = list.delete(2);
		System.out.println("\nDeleted element at index 2: " + deleted);
		System.out.println("After delete(2): " + list);

		// 9. Test size()
		System.out.println("\nCurrent Size: " + list.size());

		// 10. Test capacity()
		System.out.println("Current Capacity: " + list.capacity());

		// 11. Test isEmpty()
		System.out.println("Is Empty: " + list.isEmpty());

		// 12. Test clear()
		list.clear();
		System.out.println("\nAfter clear():");
		System.out.println(list);

		System.out.println("Size: " + list.size());
		System.out.println("Capacity: " + list.capacity());
		System.out.println("Is Empty: " + list.isEmpty());
	}
}
