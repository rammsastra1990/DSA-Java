public class SortColor {
    public static void main(String[] args) {
        int[] colors = { 1, 0, 0, 2, 1, 1 };
        sortColors(colors);
    }

    public static void sortColors(int[] clrs) {
        for (int i = 0; i < clrs.length - 1; i++) {
            int t1, t2;
            t1 = clrs[i];
            t2 = clrs[i + 1];
            if (t1 > t2) {
                clrs[i] = t2;
                clrs[i + 1] = t1;
            }
        }
        System.out.println("Colors in array after sorting ");

        for (int j : clrs) {
            System.out.println(j);
        }
    }
}