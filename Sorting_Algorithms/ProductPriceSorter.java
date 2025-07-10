import java.util.Arrays;

public class ProductPriceSorter {

    // Function to perform Quick Sort
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            // Partition the array and get pivot index
            int pivotIndex = partition(prices, low, high);

            // Recursively apply to the left and right subarrays
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Function to partition the array using the last element as pivot
    public static int partition(int[] prices, int low, int high) {
        int pivot = prices[high];  // Pivot
        int i = low - 1;           // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (prices[j] <= pivot) {
                i++;

                // Swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Swap prices[i+1] and pivot (prices[high])
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1; // Return pivot index
    }

    public static void main(String[] args) {
        int[] productPrices = {999, 499, 1299, 199, 799, 299};

        System.out.println("Original Product Prices: " + Arrays.toString(productPrices));

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("Sorted Product Prices (Ascending): " + Arrays.toString(productPrices));
    }
}
