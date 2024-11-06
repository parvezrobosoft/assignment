package task9;

public class GenericPair {

    public static void main(String[] args) {

        Pair<Integer, String> pair = new Pair<>(12, "Mohammad");

        System.out.println(pair);

        pair.setId(112);
        pair.setName("Parvez");

        System.out.println(pair);

    }

}

