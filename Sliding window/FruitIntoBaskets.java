/*
You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.
*/

import java.util.HashMap;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        System.out.println(totalFruit(new int[]{1,2,3,2,2}));
    }

    public static int totalFruit(int[] fruits) {
        int result = 0;

        HashMap<Integer, Integer> f = new HashMap<>();
        int low = 0;
        

        for (int high = 0; high < fruits.length; high++) {
            f.put(fruits[high], f.get(fruits[high])==null? 1:f.get(fruits[high])+1);
            
            while (f.size() > 2) {
                if (f.get(fruits[low]) == 1) {
                    f.remove(fruits[low]);
                }else {
                    f.put(fruits[low], f.get(fruits[low]) - 1);
                }

                low++;
            }

            if (f.size() <= 2) {
                int len = high - low + 1;
                result = result > len ? result: len;
            }


        }

        return result;
    }
}
