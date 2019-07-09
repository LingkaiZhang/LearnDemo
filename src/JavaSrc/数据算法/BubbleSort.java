package JavaSrc.数据算法;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {20, 40, 30, 10, 60, 50};
        System.out.println("排序前：");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println("\n");

        //bubbleSort(a, a.length);
        bubbleSort2(a);


        System.out.println("排序后：");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
    }

    /*
     * 冒泡排序(改进版)
     *
     * 参数说明：
     *     a -- 待排序的数组
     */
    private static void bubbleSort2(int[] a) {
        int i, j;
        int flag;        // 标记

        for (i = a.length - 1; i > 0; i--) {
            flag = 0;       // 初始化标记为0
            // 将a[0...i]中最大的数据放在末尾
            for (j = 0; j < i; j++) {
                // 交换a[j]和a[j+1]
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;

                    flag = 1;       // 若发生交换，则设标记为1
                }
            }

            if (flag == 0) {
                break;       // 若没发生交换，则说明数列已有序。
            }
        }
    }

    /*
     * 冒泡排序
     *
     * 参数说明：
     *     a -- 待排序的数组
     *     length -- 数组的长度
     */
    private static void bubbleSort(int[] a, int length) {
        int i, j;
        for (i = length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                // 将a[0...i]中最大的数据放在末尾
                if (a[j] > a[j + 1]) {
                    // 交换a[j]和a[j+1]
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }
}
