package number;

public class FindSecondLeastNumber {
    //Find the least number without sorting the array.
    public static void main(String[] args) {
        int[] array = {0, 1, 3, 2, 4,  5, 6, 7, 8, 9};

            int smallest = Integer.MAX_VALUE;
            int second_Smallest = Integer.MAX_VALUE;
            for(int i = 0; i<array.length; i++){

                if(array[i]<smallest){
                    second_Smallest = smallest;
                    smallest = array[i];
                }
                if(array[i]>smallest && array[i]<second_Smallest){
                    second_Smallest = array[i];
                }
            }
        System.out.println(smallest);
        System.out.println(second_Smallest);
    }
}
