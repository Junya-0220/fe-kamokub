import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{9, 10, 0, 2, 87, 1000};
        for(int i = 0; i <= a.length - 2; i++){
           for(int j = a.length - 1; j >= i +1; j--) {
                if(a[j] < a[j - 1]){
                    int w = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = w;
                }
            }
        }
        // ソートできたか確認
        for(int i = 0; i <= a.length -1; i++){
            System.out.println(a[i]);
        }
    }
}
