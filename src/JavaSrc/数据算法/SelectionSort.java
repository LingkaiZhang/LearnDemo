package JavaSrc.数据算法;

import java.util.Arrays;

/**
 * @Auther: lingkai
 * @Date: 2019/7/16 13:21
 * @Description: 选择排序 https://mp.weixin.qq.com/s/dGfh2t7xhg0wMM_DcYP1Cw
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 1, 5, 6, 7, 8, 30, 50, 1, 33, 24, 5, -4, 7, 0};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            //获取剩余元素的最小值得索引
            for (int j = i + 1; j < array.length; j++) {
                minIndex = array[minIndex] < array[j] ? minIndex : j;
            }
            //将最小元素放在最前面
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
