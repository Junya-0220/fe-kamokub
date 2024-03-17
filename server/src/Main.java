import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        /* for文とwhile文
        int[] array = new int[]{98,12,9,102,88};
        for(int i = 0; i <= array.length -1; i++){
            System.out.println(array[i]);
        }

        for(int value: array){
            System.out.println(value);
        }
         */

        /* 配列の平均を出す
        int[] array = new int[]{98,12,9,102,88};
        int i = 0;
        int result = 0;
        while(i <= array.length -1){
            result = result + array[i];
            i++;
        }
        System.out.println(result/array.length);

         */
        
        /*バブルソート
         int[]A = new int[]{100,0,15,22,69,985,47};

         for(int i = 0; i <= A.length-2; i++){
            for(int j = A.length - 1; j >= i + 1; j--){
                if(A[j] < A[j -1]){
                    int w = A[j];
                    A[j] = A[j-1];
                    A[j - 1] = w;
                }
            }
        }

        for(int i = 0; i <= A.length -1; i++){
            System.out.println(A[i]);
        }
         */

         int[]A = new int[]{100,0,15,22,69,985,47};

         for(int i = 0; i <= A.length-2; i++){
            for(int j = A.length - 1; j >= i + 1; j--){
                if(A[j] < A[j -1]){
                    int w = A[j];
                    A[j] = A[j-1];
                    A[j - 1] = w;
                }
            }
        }

        for(int i = 0; i <= A.length -1; i++){
            System.out.println(A[i]);
        }

    }
}
