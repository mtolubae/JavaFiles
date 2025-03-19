import java.sql.Time;
import java.time.LocalDateTime;

public class AnonymousClass {
    public static void main(String[] args) {
        //concreteCalculator cc = new concreteCalculator();
        //cc.add(1,2);
        //cc.sqroot(9);

        Calculator calc = new Calculator() {
            @Override
            public void add(int a, int b) {
                System.out.println(a+b);
            }

            @Override
            public void sqroot(int a) {
                System.out.println(Math.sqrt(a));
            }
        };

        calc.add(4,5);
        calc.sqroot(25);

        funcCalculator fc = new funcCalculator() {
            @Override
            public int add(int a, int b) {
                System.out.println(a+b);
                return a+b;
            }
        };

        fc.add(10,20);

        User u1 = new Admin();
        u1.getUserInfo();

        User u2 = new User() {
            @Override
            public void getUserInfo() {
                System.out.println("anonymous user info");
            }
        };
        u2.getUserInfo();

        User u3 = () -> System.out.println("lambda user info");
        u3.getUserInfo();

        funcCalculator fc2 = (n,m) -> n+m;
        System.out.println("funcCalculator: "+fc2.add(10,100));

        funcCalculator fc3 = (n,m) -> {
            if(n==0) m*=2;
            else m*=n;
            return m;
        };
        System.out.println(fc3.add(0,2));
    }
}

interface Calculator{
    void add(int a, int b);
    void sqroot(int a);
}

interface funcCalculator{
    int add(int a,int b);
}

class concreteCalculator implements Calculator{

    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void sqroot(int a) {
        System.out.println(Math.sqrt(a));
    }
}
@FunctionalInterface
interface User{
    void getUserInfo();
}

class Admin implements User{
    public void getUserInfo(){
        System.out.println("printing user info");
    }
}

