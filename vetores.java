
import java.lang.reflect.Array;
public class vetores {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,};
        for (int i = 0; i < 5; i++) {
            int x = (int)Array.get(a,i);
            System.out.print(x + " ");
        }
    }
}
