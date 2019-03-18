import java.util.Arrays;

public class VerifyIfTwoNumbersInAListAddUpToK {

    public static void main (String args[]) {
        int[] list1 = {10, 15, 3, 7};
        int k = 17;
        boolean containsSum = containsPairWithSum(list1, k);
        System.out.println("Contains pair with sum list={10, 15, 3, 7}, k=17? " + containsSum);

        int[] list2 = {10, 15, 3, 6};
        containsSum = containsPairWithSum(list2, k);
        System.out.println("Contains pair with sum list={10, 15, 3, 6}, k=17? " + containsSum);
    }

    public static boolean containsPairWithSum(int[] list, int k) {
    Arrays.sort(list);
    for (int i = 0, j = list.length - 1; i < j;) {
        int sum = list[i] + list[j];
        if (sum < k)
            i++;
        else if (sum > k)
            j--;
        else
            return true;
    }
    return false;
}
}