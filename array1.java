package geeksforgreeks;

/* ROTATE ARRAY BY ONE  */

import java.util.ArrayList;
class Solution {
    public void rotate(int[] arr) {
        // code here
        // int n = arr.length;
        // int temp = arr[n - 1];
        // for(int i = n-2;i>=0;i--){
        //     arr[i+1] = arr[i];
        // }
        // arr[0] = temp;
        
       ArrayList<Integer> al = new ArrayList<>();

        //store last element;
        int n = arr.length;
        int temp = arr[n - 1];

        //al add first element;
        al.add(arr[0]);

        //loop
        for (int i = 0; i < n - 1; i++) {
            al.add(arr[i]);
        }
        // System.out.println(al);
        al.set(0, temp);

        //copying to main array;
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }

    }

}