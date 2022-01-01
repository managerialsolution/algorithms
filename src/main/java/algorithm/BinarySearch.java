package algorithm;

class BinarySearch {
   public int performBinarySearch(int arr[], int searchElement)
    {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex <= rightIndex) {
            // rightIndex - leftIndex gives you sub Array
            // (rightIndex - index) / 2 will give you middle of sub array
            // leftIndex + (rightIndex - leftIndex) / 2 will give the exact position of middle element of sub array in original array
            int relativeMidIndex = leftIndex + (rightIndex - leftIndex) / 2;

            if (arr[relativeMidIndex] == searchElement)
                return relativeMidIndex;


            if (arr[relativeMidIndex] < searchElement)
                leftIndex = relativeMidIndex + 1;

               else
                rightIndex = relativeMidIndex - 1;
        }
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch binarySearch = new BinarySearch();
        int arr[] = { 20,30,40,50,60,70,80};
        int x = 70;
        int result = binarySearch.performBinarySearch(arr, x);
        if (result == -1)
            System.out.println("Element "+ x + " not present");
        else
            System.out.println("Element "+ x + " found at index " + result);

        x = 30;
        result = binarySearch.performBinarySearch(arr, x);
        if (result == -1)
            System.out.println("Element "+ x + " not present");
        else
            System.out.println("Element "+ x + " found at index " + result);
    }
}