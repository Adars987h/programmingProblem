class BubbleSort {  
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int a[] = { 94, 64, 25, 12, 41 };
      
        ob.bubbleSort(a);
      
          int n = a.length;
      
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i- 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}