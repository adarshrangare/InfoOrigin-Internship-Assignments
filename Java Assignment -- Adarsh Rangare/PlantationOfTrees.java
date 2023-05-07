/*
 Planting Trees
In a particular field. there are trees in a single row from left to right Each tree has a
value V. You cut trees from left to right and for each tree of value V that you cut. you
plant (V + 1) % M trees on the right most end with values ranging from O to
Initially. there was only one tree with value 2. Find the total number of trees present
after cutting K trees.
Input Specification:
input1: denoting the number of trees that are cut.
input2: M. denoting the modulus value.
Output Specification:
Your function should return the total number of trees in the field.
Example I:
input 1:
input2: 5
output: 3   */


import java.util.*;
public class PlantationOfTrees {


    public static int totalTreesCut(int k, int m) {
        List<Integer> trees = new ArrayList<>();
        trees.add(2);  // start with one tree of value 2
        for (int i = 0; i < k; i++) {
            int v = trees.remove(0);  // cut the leftmost tree
            for (int j = 0; j < (v+1) % m; j++) {  // plant new trees on the right end
                trees.add(j);
            }
        }
        return trees.size();  // return the total number of trees in the field
    }

    public static void main(String[] args) {

        int totalTrees = totalTreesCut(1, 5);
        System.out.println(totalTrees);
    }
}