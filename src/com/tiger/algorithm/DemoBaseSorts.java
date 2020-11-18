package com.tiger.algorithm;


public class DemoBaseSorts {


    public static void main(String[] args) {

        int[] arr = new int[]{4, 2, 6, 3, 5, 9, 7, 1, 8, 0};


        //printArr(bubbleSort(arr));
        printArr(insertSort(arr));

    }


    /**
     * 题目：冒泡排序
     * <p>
     * 定义一个布尔变量 hasChange，用来标记每轮是否进行了交换。在每轮遍历开始时，将 hasChange 设置为 false。
     * <p>
     * 若当轮没有发生交换，说明此时数组已经按照升序排列，hashChange 依然是为 false。此时外层循环直接退出，排序结束
     *
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {

        if (arr == null) {
            return null;
        }


        boolean haschange = true;

        for (int i = 0, len = arr.length; i < len; i++) {

            haschange = false;

            for (int j = i; j < len - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                    haschange = true;

                }
            }

            if (haschange) {
                break;
            }


        }

        return arr;
    }


    /**
     * 题目：插入排序（打扑克）
     * 与冒泡排序对比：
     * <p>
     * 在冒泡排序中，经过每一轮的排序处理后，数组后端的数是排好序的。
     * 在插入排序中，经过每一轮的排序处理后，数组前端的数是排好序的。
     * 插入排序的算法思想是：不断将尚未排好序的数插入到已经排好序的部分。
     *
     * @param arr
     * @return
     */
    public static int[] insertSort(int[] arr) {

        if (arr == null) {
            return null;
        }

        for (int i = 0; i < arr.length - 1; i++) {

            // 1. get the insert value

            int curValue = arr[i];
            int j = i;
            // 2. find the location
            while (j > 0 && curValue < arr[j - 1]) {

                arr[j] = arr[j - 1];
                j--;
            }
            if (j != i) {
                //3. insert
                arr[j] = curValue;
            }

        }

        return arr;
    }


    private static void printArr(int[] arr) {

        if (arr == null) {
            System.out.println("arr is null");

            return;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + i);
        }

        System.out.println(" .");

    }

}
