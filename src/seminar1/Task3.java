package seminar1;

public class Task3 {
    public int[] divArrays(int[] a, int[] b){
        int[] newArray = new int[a.length];

        if (a.length != b.length || a == null || b == null) {
            return new int[] {0};
        }
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0) throw new RuntimeException("Division by 0");
            else newArray[i] = a[i] / b[i];
        }
        return newArray;
    }
}
