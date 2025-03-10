package loosely_coupling;

import java.util.Arrays;

//Loosely coupling
interface SortAlgorithm {
    void sort(int[] array);
}

class LooselyBubbleSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        System.out.println("Sắp xếp thử dụng BubbleSort");
        Arrays.stream(array).sorted().forEach(System.out::println);
    }
}

class LooselyCouplingService{
    private SortAlgorithm[] sortalgorithms;

    public LooselyCouplingService() {}

    public LooselyCouplingService(SortAlgorithm[] sortalgorithms) {
        this.sortalgorithms = sortalgorithms;
    }

    public void complexBusiness(int[] array){
        sortalgorithms.sort(array);
    }
}