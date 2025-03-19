import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trio<A,B,C> {
    private A trioA;
    private B trioB;
    private C trioC;

    public Trio(A a, B b, C c){
        trioA = a;
        trioB = b;
        trioC = c;
    }

    public String toString(){
        return trioA + ", "+trioB+", "+trioC;
    }
    public void display(){
        System.out.println(trioA.toString() + ", "+trioB.toString()+", "+trioC.toString());
    }

    public static void main(String[] args) {
        Trio<Integer,String,Double> t = new Trio<>(10,"Ten",10.0);
        t.display();

        Trio<Trio,Character,Exception> tt = new Trio<>(t,'c',new Exception());
        tt.display();

        Trio<Number, Boolean, Object> tt3 = new Trio<>(3.14,true,new Book("Harry Potter","J.K.Rowling",300));
        tt3.display();
    }
}

class Storage<T>{
    private ArrayList<T> list;

    public Storage() {
        this.list = new ArrayList<>();
    }

    public void addItem(T item){
        list.add(item);
    }

    public T getItem(int index){
        return list.get(index);
    }

    public void removeItem(int index){
        list.remove(index);
    }

    public int size(){
        return list.size();
    }

    public void displayAll(){
        for(T item:list){
            System.out.println(item);
        }
    }

    public void printItem(List<T> items){
        System.out.println(items);
    }

    public static void main(String[] args) {
        Storage<Integer> si = new Storage<>();
        for (int i=1; i<5;i++) si.addItem(i);
        si.displayAll();
        System.out.println("-----------------");
        Storage<String> ss = new Storage<>();
        for(int i=1; i<5;i++) ss.addItem(i+""+i+"");
        ss.displayAll();

    }
}
