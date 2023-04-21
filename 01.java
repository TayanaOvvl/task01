import java.util.*;

public class Level1 {
    public static int squirrel(int N) {
        int nutAmount = 1;
        
        for (int i = 1; i <= N; i++) {
            nutAmount = nutAmount * i;
        } 
        
        while (nutAmount > 9)
            nutAmount = nutAmount / 10;
        
        return nutAmount;
    } 