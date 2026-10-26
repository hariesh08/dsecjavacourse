package dsecjavacourse;

public class linearsearch {
    public static void main(String[] args) {
        int[] a = {10, 15, 20, 25, 30, 35};
        int target = 20;
        int ind = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                ind = i;
                break;
            }
        }

        if (ind != -1) {
            System.out.println("element is found at index " + ind);
        } else {
            System.out.println("element is not found");
        }
    }
}