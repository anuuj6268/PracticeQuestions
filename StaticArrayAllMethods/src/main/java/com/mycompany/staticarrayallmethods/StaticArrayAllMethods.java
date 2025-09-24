package com.mycompany.staticarrayallmethods;

public class StaticArrayAllMethods {

    public static void main(String[] args) {
        Array ar1 = new Array(20);
        ar1.addFirst(2);
        ar1.addFirst(3);
        ar1.addFirst(65);
        System.out.print("1. Add First : ");
        ar1.print();
        System.out.print("2. Add Last : ");
        ar1.addLast(3);
        ar1.addLast(98);
        ar1.addLast(99);
        ar1.print();
        System.out.print("3. Add Index : ");
        ar1.addIndex(1, 4);
        ar1.print();
        System.out.print("4. Remove First : ");
        ar1.removeFirst();
        ar1.print();
        System.out.print("5. Remove Last : ");
        ar1.removeLast();
        ar1.print();
        System.out.print("6. Remove Index : ");
        ar1.removeIndex(1);
        ar1.print();
        int[] arr = {200, 202, 204, 206};
        ar1.mergeFirst(arr);
        System.out.print("7. Merge First : ");
        ar1.print();
        ar1.mergeLast(arr);
        System.out.print("8. Merge Last : ");
        ar1.print();
        System.out.print("9. Merge Index : ");
        int[] arr1 = {111, 222, 333, 444, 555, 666};
        ar1.mergeIndex(arr1, 2);
        ar1.print();
        System.out.println("10. Linear Search 222 : " + ar1.linearSearch(222));
        System.out.print("11. Descending Sort : ");
        ar1.descendingSort();
        ar1.print();
        ar1.ascendingSort();
        System.out.print("12. Ascending Sort : ");
        ar1.print();
        System.out.println("13. Binary Search 222 : " + ar1.binarySearch(222));
        System.out.print("14. View First : ");
        ar1.viewFirst();
        System.out.print("15. View last : ");
        ar1.viewLast();
        System.out.print("16. View Index  2 : ");
        ar1.viewIndex(2);
        System.out.print("17. Get First : " + ar1.getFirst());
        System.out.print("18. Get Last : " + ar1.getLast());
        System.out.print("19. Get Index 2 : " + ar1.getIndex(2));
        System.out.print("20. Update first with 555 : ");
        ar1.updateFirst(555);
        ar1.print();
        System.out.print("21. Update Last with 555 : ");
        ar1.updateLast(555);
        ar1.print();
        System.out.print("22. Update Index 3 with 356 : ");
        ar1.updateIndex(3, 356);
        ar1.print();
        System.out.println("23. First Occurence of 555 : " + ar1.firstOccurence(555));
        System.out.println("24. Last Occurence of 555 : " + ar1.lastOccurence(555));
    }
}
