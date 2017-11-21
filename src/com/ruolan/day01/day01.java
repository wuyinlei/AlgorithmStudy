package com.ruolan.day01;

public class day01 {

    public static void main(String[] args) {

        int[] ints = SortTestHelper.generateRandomArray(0, 1001, 1000);

        selectionSort(ints, 1000);

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ", ");
        }

    }


    /**
     * 选择排序算法
     * <p>
     * 例如  3   1   2
     * <>
     * 第一次循环
     * i=0    minIndex = 0    j=1    n=3  循环下来  minIndex = 1  这个时候内层循环完事  然后排序交换为  1  3  2
     *
     * i=1    minIndex = 1    j = 2  n = 3  循环下来   minIndex = 2   这个是内层循环完事   然后排序    为 1  2  3
     *
     * </>
     *
     * @param arr 数组
     * @param n   数组的大小
     */
    public static void selectionSort(int[] arr, int n) {

        //第一层for循环
        for (int i = 0; i < n; i++) {

            int minIndex = i;  //定义一个标志位   标志位的大小就是第一层for循环的index

            //第二层for循环
            for (int j = i + 1; j < n; j++) {
                //在第二层for循环中  判断标志位位置的数字是否大于内层j的位置的值
                if (arr[minIndex] > arr[j]) {
                    //如果大于了 那么这两个应该进行交换  也就是  如果3  1  那么就换成1  3
                    minIndex = j;  //这个时候就需要把那个小的标志位给minIndex
                }
            }

            swap(arr, minIndex, i);
        }

    }

    /**
     * 交换
     *
     * @param arr 数组
     * @param a   位置a
     * @param b   位置b
     */
    public static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

}
