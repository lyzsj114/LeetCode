package array.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角问题
 */

public class PascalTriangle {
   public List<List<Integer>> generater(int numRows) {
       List<List<Integer>> rnt = new ArrayList<>();
       for (int i = 0; i < numRows; i++) {
           List<Integer> nums = new ArrayList<>();
           if (rnt.size() == 0) nums.add(1);
           
           rnt.add(nums);
       }
       return rnt;
   }
}
