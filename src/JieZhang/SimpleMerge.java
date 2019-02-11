package JieZhang;

public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] combinearray = new int[arr1.length + arr2.length];
        int ind = 0;
        int ind1=0;
        int ind2=0;
        while (ind < combinearray.length) {
            if (ind1 == arr1.length || ind2 == arr2.length) {
                if (ind1 == arr1.length) {
                    combinearray[ind++] = arr2[ind2++];

                }
                else {
                    combinearray[ind++] = arr1[ind1++];
                }
            }
            else {
                if (arr1[ind1] < arr2[ind2]) {
                    combinearray[ind++] = arr1[ind1++];
                }
                else {
                    combinearray[ind++] = arr2[ind2++];
                }
            }
        }

        return combinearray;
    }
}