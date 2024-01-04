import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static void main(String[] args) {
        int[] nums;
        nums = new int[100000];
        for (int i = 0; i < 100000; i++){
            nums[i] = ThreadLocalRandom.current().nextInt(0,1000000);
        }
        Sorter bb = new BubbleSorter();

        long time = bb.sort(nums);
        SortTester tester = new SortTester();
        if (tester.sorted(nums)){
            System.out.println("Successful sort!");
        } else {
            System.out.println("Did not sort.");
        }
        float displaytime = (float)time/1000000000;
        System.out.println("BubbleSort: " + displaytime + " seconds");




    }
}