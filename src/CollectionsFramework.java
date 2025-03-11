import java.util.*;

public class CollectionsFramework {
    public static void main(String[] args) {
        //ArrayList
        /*ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(5);
        arraylist.add(10);
        arraylist = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        for(int i=0; i<arraylist.size();i++){
            if(arraylist.get(i) %2 == 0){
                arraylist.remove(i);
            }
        }
        arraylist.set(0,-1);
        arraylist.add(3,100);
        arraylist.addLast(-1);
        ArrayList<Integer> arraylist2 = new ArrayList<>(Arrays.asList(200,300,400));
        arraylist.remove(Integer.valueOf(-1));
        arraylist.addAll(arraylist2);
        System.out.println(arraylist);

         */

        //LinkedList
  /*      LinkedList<String> ll = new LinkedList<>(Arrays.asList("name","surname","zipcode"));
        ll.add("address");
        ll.offer("city");
        System.out.println(ll);
        System.out.println(ll.poll());
        System.out.println(ll.peek());
        System.out.println(ll);
        System.out.println(ll.get(2));
        System.out.println(ll.pop());
        System.out.println(ll);

        System.out.println("using iterator");
        Iterator<String> iterator = ll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ll.add(1,"email");
        ll.remove(ll.size()-2);
        ll.remove("zipcode");
        System.out.println(ll);
*/
        //HashSet
 /*       HashSet<Integer> hs = new HashSet<>(Arrays.asList(6,1,2,3,4,1));
        hs.add(10);
        System.out.println(hs);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(Arrays.asList(6,1,2,3,4,1));
        lhs.add(10);
        System.out.println(lhs);

        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(6,1,2,3,4,10,1));
        System.out.println(ts);

        Iterator<Integer> iter = ts.descendingIterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+ " ");
        }
        System.out.println();
        System.out.println(ts.first());
        System.out.println(ts.pollLast());
        System.out.println(ts);
        */
/*
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Tolon");
        map.put(2, "Elina");
        map.put(3,"Daniyal");

        for(Map.Entry<Integer,String> item: map.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
            System.out.println(item);
        }

        System.out.println("Iterating with Iterator");
        Iterator<Map.Entry<Integer,String>> iter2 = map.entrySet().iterator();
        while(iter2.hasNext()){
            Map.Entry<Integer, String> n = iter2.next();
            System.out.println(n.getKey() + " "+n.getValue());
        }

 */
        //ArrayDeque
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.push(10); ad.push(20); ad.push(30);
        System.out.println(ad);
        for (Integer i: ad){
            System.out.println(ad.pop());
        }

        ad.offer(1); ad.offer(3); ad.offer(5);
        System.out.println(ad);
        ad.addFirst(-1);
        ad.addLast(7);
        System.out.println(ad);

    }
}

