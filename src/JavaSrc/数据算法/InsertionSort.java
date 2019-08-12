package JavaSrc.数据算法;

import java.util.Arrays;

/**
 * @Auther: lingkai
 * @Date: 2019/8/12 13:09
 * @Description: 插入排序  https://mp.weixin.qq.com/s/McqFXkXucSZldjU46t5cdw
 */
public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {12, 1, 3, 46, 5, 0, -3, 12, 35, 16};
        insertiontSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertiontSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int insertVAlue = array[i];
            int j = i - 1;
            //从右向左比较元素的同时，进行元素复制
            for (; j >= 0 && insertVAlue < array[j]; j--) {
                array[j + 1] = array[j];
            }
            //insertValue的值插入适当位置
            array[j + 1] = insertVAlue;
        }
    }
}
