import java.util.stream.Stream;

class Ex2Q1 {

    private static class Triangle{
        private final Integer num1;

        public Triangle(Integer n1){
            this.num1 = n1;
        }

        public int NextStep (){
            return (((num1 + 1) * num1) /  2);
        }
    }

    public static void main(String[] args) {
        Triangle myt1 = new Triangle(0);
        System .out.print(myt1.NextStep());
        ///Method 1
       Stream<Integer> mystream = Stream.iterate(0, n -> n + 1)  // Start + Sequence
               .map(n -> (((n + 1) * n) / 2))
               .limit(10);
        mystream.forEach(System.out::println);
    }
}
