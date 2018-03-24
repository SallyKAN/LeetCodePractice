import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> builder = new ArrayList<String>();
        for (int i = ; i<=n;i++){
            if(1%15 == 0)
                builder.add("FizzBuzz");
            else if (i%5 == 0)
                builder.add("Buzz");
            else if(i%3 == 0)
                builder.add("Fizz");
            else
            builder.add(String.valueOf(i+1));
        }
        return builder;
    }
}
