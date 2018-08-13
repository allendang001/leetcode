package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _7_ReversInteger {

    public static int reverse(int x) {
        int result = 0;
        List<Integer> tmp = new ArrayList();

        while((x%10)!=0 || (x/10)!=0){
            tmp.add(x%10);
            x=x/10;
        }
        int index = tmp.size();
        int k = 0;
        for (int i = index-1;i >= 0; i--){
            int num = tmp.get(i);
            result += num * Math.pow(10,k++);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
