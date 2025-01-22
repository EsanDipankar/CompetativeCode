import java.util.ArrayList;

public class mergeSort {
    public static void main(String[] args) {
        ArrayList<Integer> Arr= new ArrayList<Integer>();
        Arr.add(1);
        Arr.add(4);
        Arr.add(10);
        Arr.add(2);
        Arr.add(1);
        Arr.add(5);
        solve(Arr, 0, Arr.size() - 1);
        System.out.println(Arr);  
    }
    public static void solve(ArrayList<Integer> A, int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = (l + r) / 2;
        solve(A, l, mid);
        solve(A, mid + 1, r);
        merge(A, l, mid, r);
    }
    public static void merge(ArrayList<Integer> A, int l, int mid, int r) {
        ArrayList<Integer> temp = new ArrayList<>();

        int s1 = l, e1 = mid, s2 = mid + 1, e2 = r;
        while (s1 <= e1 && s2 <= e2) {
            if (A.get(s1) <= A.get(s2)) {
                temp.add(A.get(s1++));
            } else {
                temp.add(A.get(s2++));
            }
        }
        while (s1 <= e1) {
            temp.add(A.get(s1++));
        }
        while (s2 <= e2) {
            temp.add(A.get(s2++));
        }
        for (int i = 0; i < temp.size(); i++) {
            A.set(l + i, temp.get(i));
        }
    }
}
