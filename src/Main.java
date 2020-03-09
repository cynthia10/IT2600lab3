public class Main {
    public static void main(String[] args) {



        Stack s = new Stack(3);

        s.push(new Listing("Bob", "1st Avenue","123-1111"));

       s.push(new Listing("Joe", "2nd Avenue","134-1235"));

        s.push(new Listing("Jane","3rd Avenue", "123-2225"));

       s.showAll();



        System.out.println(s.overflow());

        System.out.println(s.underflow());

        s.emptyStack();

       s.showAll();

        System.out.println(s.underflow());



        s.push(new Listing("Bob", "1st Avenue","123-1111"));

        s.push(new Listing("Joe", "2nd Avenue","134-1235"));

        s.push(new Listing("Jane", "3rd Avenue","123-2225"));


        s.showAll();



    }

}
