package seminar1;

class Task2 {
    public int[] subArrays(int[] a, int[] b){
        int[] newArray = new int[a.length];

        if (a.length != b.length) {
            return new int[] {0};
        }
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i] - b[i];
        }
        return newArray;
    }
}
