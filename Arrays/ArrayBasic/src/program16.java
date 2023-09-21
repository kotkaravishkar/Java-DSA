public class program16 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 3, 4};
        System.out.println(countRotations(arr));
    }

    static int countRotations(int arr[])
    {
        // We basically find index of minimum
        // element
        int min = arr[0];
        int min_index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }
}
