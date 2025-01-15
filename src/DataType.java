import java.util.ArrayList;
import java.util.List;

public class DataType {

    public static void main(String[] args) {
        // primitívek
        byte number1 = 100;
        short number2 = 10000;
        int number3 = 100000;
        long number4 = 100000000000L;

        float number5 = 3.14f;
        double number6 = 3.14;

        char letter = 'a';
        boolean isValid = true;

        Byte number11 = number1; // auto-boxing, osztály tipusú változó
        number11.byteValue(); // vissza alakítom byte tipusú a primitívet
        number11.toString(); // stringé alakítom

        String name = "John"; // string poolban tárolódik, mindig ugyanaz mint a name3
        String name2 = "john"; // pool
        String name3 = "John"; // pool
        String name4 = new String("John"); // mindig új objektum a new miatt heapben tároloódik

        boolean isSame1 = name == name2;
        System.out.println(isSame1);
        boolean isSame2 = name == name3;
        System.out.println(isSame2);
        boolean isSame3 = name == name4;
        System.out.println(isSame3);
        boolean isSame4 = name.equals(name2);
        System.out.println(isSame4);
        boolean isSame5 = name.equalsIgnoreCase(name2); // nem veszi figyelembe hogy kis vagy nagybetű van benne
        System.out.println(isSame5);
        boolean isSame6 = name.equals(name4); // nem teljes egyenlőséget néz, hanem csak a beltartalmat, a betűket
        // hasonlítja össze

        List<Integer> numbers = new ArrayList<>(); // a listában primitíveket, pl int-et nem tudunk tárolni
        numbers.add(1);
        numbers.contains(1);
        numbers.remove(0); // 0-dik indexen állót távolítja el
        int size = numbers.size();
        System.out.println(size);

        int[] nums = {1, 2, 3, 4, 5};
        //listának size-a van, primitív tipusnak viszont length-e van
        int length = nums.length;
        System.out.println(length);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.toArray(); // olyan tömböt hoz létre a listából, amiben odjectumokat tudunk tárolni
        Integer[] nums2 = {1, 2, 3, 4, 5};
    }
}
