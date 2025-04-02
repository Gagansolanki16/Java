class array2 {
    public static void main(String[] args) {
        int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        float sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Average of numbers in array: " + sum / n);
    }
}

