public class Lab7 {
    public static void main(String[] args) {
        test3();
    }
    public static void test1 (){
        System.out.println("Testing Adding Removing and Clear Set");

        MSet<Integer> c = new MSet<>();
        c.add(2);
        c.add(4);
        c.add(6);

        System.out.println("Members in set c");
        for (Integer element : c) {
            System.out.println(element);
        }
        System.out.println("Size before removing 2,4 = "+c.size());

        c.remove(2);
        c.remove(4);
        System.out.println("Size after removing 2,4 = "+c.size());

        c.clear();
        System.out.println("Size after clear set = "+c.size());

        System.out.println("c is Empty ? = "+c.isEmpty());
    }
    public static void test2 (){
        MSet<Integer> c = new MSet<>();
        MSet<Integer> c1 = new MSet<>();

        c.add(1);
        c.add(2);
        System.out.println("Members in set c");
        for(Integer element : c){
            System.out.println(element);
        }
        System.out.println("Size before add c1 = "+c.size());

        c1.add(100);
        c1.add(200);
        System.out.println("Members in set c1");
        for(Integer element : c1){
            System.out.println(element);
        }
        System.out.println("Size of c1 = "+c1.size());

        c.addAll(c1);
        System.out.println("Members in c after addAll c1");
        for (Integer element : c){
            System.out.println(element);
        }
        System.out.println("Size after addAll c1 = "+c.size());

        System.out.println("Set c containAll c1? = "+c.containsAll(c1));

        c.removeAll(c1);
        System.out.println("Size after removeAll c1 = "+c.size());
    }
    public static void test3 (){
        MSet<Integer> c = new MSet<>();
        System.out.println("Add 1,2 to Set c");
        c.add(1);
        c.add(2);
        System.out.println("Set c contain 2?: "+c.contains(2));
        System.out.println("Set c contain 3?: "+c.contains(3));

        System.out.println("Add 1,7,3,2 to Set c1");
        MSet<Integer> c1 = new MSet<>();
        c1.add(1);
        c1.add(7);
        c1.add(3);
        c1.add(2);
        System.out.println("c have 1 7 3 2 = "+c.containsAll(c1));

        System.out.println("Remove 7,3 from c1");
        c1.remove(7);
        c1.remove(3);

        System.out.println("Member of Set c1");
        for (Integer element : c1){
            System.out.println(element);
        }

        System.out.println("c have 1 2 = " +c.containsAll(c1));

        System.out.println("retainAll c1 on c");
        c.retainAll(c1);
        System.out.println("Member of c");
        for (Integer element : c){
            System.out.println(element);
        }
    }
}
