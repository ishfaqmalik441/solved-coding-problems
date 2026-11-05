// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
    List<List<Pair>> result = new ArrayList<>();
    if (pairs.size() == 0) {
        return result;
    }
    result.add(new ArrayList<>(pairs));

    for (int i = 1; i < pairs.size(); i++) {
        Pair keyPair = pairs.get(i);
        int j = i - 1;
        int k = i;
        while (j >= 0 && pairs.get(j).key > keyPair.key) {
            Pair smallerVal = pairs.get(j);
            pairs.set(j, keyPair);
            pairs.set(k, smallerVal);
            j--;
            k--;
        }
        result.add(new ArrayList<>(pairs));
    }
    return result;
        }
}
