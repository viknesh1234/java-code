import java.util.*;

class DynamicArray {
    private static final int INITIAL_CAP = 5;
    private int arr[];
    private int size;
    private int cap;

    DynamicArray() {
        this.arr = new int[INITIAL_CAP];
        this.size = 0;
        this.cap = INITIAL_CAP;
    }

    public void add(int val) {
        if (size == cap) {
            expandArray();
        }
        arr[size++] = val;
    }

    private void expandArray() {
        cap *= 2;
        arr = Arrays.copyOf(arr, cap);
    }

    public void display() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Elements in the list: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void insertAtPos(int pos, int val) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }
        if (size == cap) {
            expandArray();
        }
        for (int i = size - 1; i >= pos ; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = val;
        size++;
    }

    public void deleteAtPos(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position");
            return;
        }
        for (int i = pos +1; i < size-1; i++) {
            arr[i -1] = arr[i];
        }
        size--;

        if (cap > INITIAL_CAP && cap > 3 * size) {
            shrinkArray();
        }
    }

    private void shrinkArray() {
        cap /= 2;
        arr = Arrays.copyOf(arr, cap);
    }
   
    public int get (int index1){
        for(int i =0; i<size; i++){
            if(arr[i] == index1){
                return arr[index1];
            }
        }
        return -1;
    }
    public int upadte (int newindex, int valindex){
        for(int i=0; i<size; i++){
            if(i == newindex){
                arr[i] = valindex;
                return arr[i];
            }
        }return -1;

    }
     public int searchAtElement (int element){
        for(int i=0; i<size; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1; // element not found
    }
     public boolean contains(int findval) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == findval) {
                return true;
            }
        }
        return false;
    }
    

    public int  getsize(){
        return size;
    }
    public void clear(){
        size =0;
        cap = INITIAL_CAP;
        arr = new int[cap];
        System.out.println("List cleared");
    }
}

public class dynamicarraydemo {
    public static void main(String[] args) {
        DynamicArray list = new DynamicArray();
        Scanner sc = new Scanner(System.in);
        int val, pos;

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Insert element");
            System.out.println("2. Display elements");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete at position");
            System.out.println("5. Exit");
            System.out.println("6. Search element");
            System.out.println("7. Get element at index");
            System.out.println("8. Update element at index");
            System.out.println("9. contains the value");
            System.out.println("10. get size length");
            System.out.println("11 . Clear the list");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    val = sc.nextInt();
                    list.add(val);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    System.out.print("Enter element: ");
                    val = sc.nextInt();
                    list.insertAtPos(pos, val);
                    break;
                case 4:
                    System.out.print("Enter position to delete: ");
                    pos = sc.nextInt();
                    list.deleteAtPos(pos);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                 case 6: System.out.println("search of elemet");
                    int element = sc.nextInt();
                    int index = list.searchAtElement(element);
                    if(index != -1){
                        System.out.println("Element found at index: " + index);
                    } else {
                        System.out.println("Element not found");
                    }
                    break;
                case 7 : System.out.println("get a index");
                    int index1 = sc.nextInt();
                     list.get(index1);
                     System.out.println("element of index is " + list.get(index1));
                    break;
                case 8: System.out.println("upadte the index");
                    System.out.println("Enter index to update: ");
                    int newindex = sc.nextInt();
                    System.out.println("Enter new value: ");
                    int valindex = sc.nextInt();
                       list.upadte(newindex, valindex);
                    break;
                case 9: System.out.println("contains the value");
                    int findval = sc.nextInt();
                    if ( list.contains(findval)){
                      System.out.print("list of findval " + findval);
                     } else { 
                        System.out.print("not found " + findval);
                     }
                     break;
                case 10 : System.out.println("get size length");
                    System.out.println("list of elements size : " +list.getsize());
                    break;
                case 11: System.out.println("clear the list");
                    list.clear();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
