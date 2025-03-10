package tight_loosely_coupling;

import java.util.Arrays;

public class BubbleSortAlgorithm {
    public void sort(int[] arr){
        System.out.println("Sắp xếp theo giải thuật BubbleSort");
        int n = arr.length;

        boolean swapped;
        for(int i = 0; i<n; i++){
            swapped = false;
            for(int j = 0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

}

class TightCouplingService{
    private BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

    public TightCouplingService(){}

    public TightCouplingService(BubbleSortAlgorithm bubbleSortAlgorithm) {
        this.bubbleSortAlgorithm = bubbleSortAlgorithm;
    }

    public void complexBusinessSort(int[] arr){
        bubbleSortAlgorithm.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        TightCouplingService tightCouplingService = new TightCouplingService();
        tightCouplingService.complexBusinessSort(new int[] {1,2,5,7,10,6,12});
    }
}

