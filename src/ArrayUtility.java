public class ArrayUtility {


    public static void print(int[] array) {
        for (int i : array) {
            System.out.println(i + ", ");
        }
    }

    public static int sum(int[] array) {
        int out = 0;
        for (int i : array) {
            out += i;
        }
        return out;
    }

    public static double average(int[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) average += array[i];

        int temp = (int) (average / array.length * 100.0);
        return temp / 100.0;
    }

    public static int minimum(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }

        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }

        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;

        for (int i : array) {
            if (i % 2 == 0) count++;
        }

        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] arr = new int[array.length];
        int n = 0;

        for (int i = array.length-1; i >= 0; i--) {
            arr[n] = array[i];
            n++;
        }

        return arr;
    }

    public static void reverseTwo(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int start = array[i];
            int end = array[array.length-1-i];
            array[i] = end;
            array[array.length-1-i] = start;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i : array) {
            if (i == num) return true;
        }

        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String i : array) {
            if (i.equals(str)) return true;
        }

        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
        String out = "";

        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1) out += array[i] ;
            else out += array[i] + ", ";
        }

        return out;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (i == j) continue;
                else if (array[i] + array[j] == num) return true;
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int last = array[array.length-1];
        for (int i = array.length-1; i > 0; i--) array[i] = array[i-1];
        array[0] = last;
    }

    public static void shiftLeft(int[] array) {
        int start = array[0];
        for (int i = 0; i < array.length-1; i++) array[i] = array[i+1];
        array[array.length-1] = start;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        n = n % array.length;    //when n > length

        int[] temp = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int index = (i+n) % array.length;
            temp[index] = array[i];
        }

        for (int i = 0; i < array.length; i++) array[i] = temp[i];
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        n = n % array.length;

        int[] temp = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int newIndex = (i-n+array.length) % array.length;
            temp[newIndex] = array[i];
        }

        for (int i = 0; i < array.length; i++) array[i] = temp[i];
    }
}
