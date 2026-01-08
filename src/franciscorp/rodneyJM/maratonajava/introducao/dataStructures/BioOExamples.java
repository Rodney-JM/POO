package franciscorp.rodneyJM.maratonajava.introducao.dataStructures;

public class BioOExamples {
    public static int getFirstElement(int [] arr){
        return arr[0]; //O(1)
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0, right = arr.length - 1;

        while(left<=right){
            int mid = (left + right)/ 2;
            if( arr[mid] == target) return mid;
            else if(arr[mid] < target) left = mid +1;
            else right = mid-1;
        }

        return -1; //O(log n)
    }

    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == target) return i;
        }
        return -1; // O(n)
    }

    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i< n1; i++) L[i] = arr[left + i];
        for(int j = 0; j< n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while(i<n1 && j<n2){
            if(L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        } // O(n log n)
    }

    public static void printPairs(int[] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.println(arr[i] + ", " + arr[j]);
            }
        } // O(n2)
    }

    public static void printTriplets(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                for(int k = 0; k< arr.length; k++){
                    System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
                }
            }
        }// O(n3)
    }

    public static int fib(int n){
        if( n<= 1) return n;
        return fib(n -1) + fib(n - 2); // O(2n)
    }
}
