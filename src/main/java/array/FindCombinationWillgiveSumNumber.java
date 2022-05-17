package array;

public class FindCombinationWillgiveSumNumber {
    public static void main(String[] args) {
        Integer[] iArray = new Integer[]{1,1,3,2,6,4};
        int value = 5;
        for(int i = 0; i<iArray.length;i++) {
            if (iArray[i] == value) {
                System.out.println("[" + iArray[i] + "]");
            } else {

                for (int j = i + 1; j < iArray.length; j++) {

                    if (iArray[i] + iArray[j] == value) {
                        System.out.println("[" + iArray[i] + "," + iArray[j] + "]");
                    }

                }

            }
        }
    }
}
