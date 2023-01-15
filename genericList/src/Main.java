public class Main {
    public static void main(String[] args){
        MyList<Integer> Test = new MyList<>();
        System.out.println("Capacity is: " +Test.getCapacity());
        System.out.println("List is : "+(Test.isEmpty() ? "Empty" : "Full"));
        System.out.println("Number of Elements: "+Test.size());

        Test.add(1);
        Test.add(2);
        Test.add(3);
        Test.add(4);
        Test.add(5);
        Test.add(6);
        Test.add(7);
        Test.add(8);
        Test.add(9);
        Test.add(10);
        Test.add(11);
        Test.add(12);
        Test.add(2);

        System.out.println("Capacity is: " +Test.getCapacity());
        System.out.println("List is : "+(Test.isEmpty() ? "Empty" : "Full"));
        System.out.println("Number of Elements in: "+Test.size());
        System.out.println(Test.get(0));
        Test.remove(0);
        System.out.println(Test.get(0));
        System.out.println(Test.firstIndexOf(2));
        System.out.println(Test.lastIndexOf(2));
        Test.clear();
        System.out.println("List is : "+(Test.isEmpty() ? "Empty" : "Full"));
        System.out.println("Capacity is: " +Test.getCapacity());


        MyList<Integer> Test2 = new MyList<>(8);
        System.out.println("Capacity is: " +Test2.getCapacity());
        System.out.println("List is : "+(Test2.isEmpty() ? "Empty" : "Full"));
        System.out.println("Number of Elements: "+Test2.size());

        Test2.add(1);
        Test2.add(2);
        Test2.add(3);
        Test2.add(6);
        Test2.add(5);
        Test2.add(2);
        Test2.add(7);
        Test2.add(8);
        Test2.add(2);
        Test2.add(10);
        Test2.add(11);
        Test2.add(12);
        Test2.add(2);

        System.out.println("Capacity is: " +Test2.getCapacity());
        System.out.println("List is : "+(Test2.isEmpty() ? "Empty" : "Full"));
        System.out.println("Number of Elements in: "+Test2.size());
        System.out.println(Test2.get(0));
        Test2.remove(0);
        System.out.println(Test2.get(0));
        System.out.println(Test2.firstIndexOf(2));
        System.out.println(Test2.lastIndexOf(2));
        Test2.clear();
        System.out.println(Test2.lastIndexOf(2));
        System.out.println("List is : "+(Test2.isEmpty() ? "Empty" : "Full"));
        System.out.println("Capacity is: " +Test2.getCapacity());







    }
}