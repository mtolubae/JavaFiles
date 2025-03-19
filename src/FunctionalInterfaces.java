import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Function<Integer,Double> f = n->n/1.0;
        System.out.println(f.apply(10));

        Predicate<Integer> p = n->{
            if(n%2==0) return true;
            else return false;
        };

        System.out.println(p.test(5));

        Consumer<String> c = str -> System.out.println(str);
        c.accept("Hello World");

        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        System.out.println(s.get());

        UnaryOperator<Integer> doubleOper = n->2*n;
        System.out.println(doubleOper.apply(3));

        BinaryOperator<Boolean> andOper = (x,y) ->x && y;
        System.out.println(andOper.apply(true, false));

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.forEach(n->{
            System.out.println(n*n);
        });


    }
}
