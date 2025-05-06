// Definition for singly-linked list node
class Merge2Sorted {
    int val;
    Merge2Sorted next;

    Merge2Sorted() {}

    Merge2Sorted(int val) { 
        this.val = val; 
    }

    Merge2Sorted(int val, Merge2Sorted next) { 
        this.val = val; 
        this.next = next; 
    }
}

class Solution {
    public Merge2Sorted mergeTwoLists(Merge2Sorted list1, Merge2Sorted list2) {
        Merge2Sorted list = new Merge2Sorted(0); // Dummy node
        Merge2Sorted current = list;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = (list1 != null) ? list1 : list2;
        return list.next;
    }
}

public class Merge2SortedList {
    public static void main(String[] args) {
        // Creating first sorted list: 1 -> 2 -> 4
        Merge2Sorted l1 = new Merge2Sorted(1, new Merge2Sorted(2, new Merge2Sorted(4)));

        // Creating second sorted list: 1 -> 3 -> 4
        Merge2Sorted l2 = new Merge2Sorted(1, new Merge2Sorted(3, new Merge2Sorted(4)));

        // Merge the lists
        Solution sol = new Solution();
        Merge2Sorted merged = sol.mergeTwoLists(l1, l2);

        // Print merged list
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
}
