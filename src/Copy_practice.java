import java.util.ArrayList;
import java.util.Collections;

//Task 1
/*
public class Copy_practice {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Mersedes");
        cars.add("Lamborghini");
        cars.add("Bugatti");
        System.out.println(cars);
    }
}
*/

//Task 2
/*
public class Copy_practice {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Mersedes");
        cars.add("Lamborghini");
        cars.add("Bugatti");
        for (int i = 0 ; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}
*/

//Task 3
/*
public class Copy_practice {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Mersedes");
        cars.add("Lamborghini");
        cars.add("Bugatti");
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
*/

//Task 4
/*
public class Copy_practice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(1045);
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
*/

//Task 5
/*
public class Copy_practice {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Mersedes");
        cars.add("Lamborghini");
        cars.add("Bugatti");
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
*/

//Task 6
/*
public class Copy_practice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(78);
        numbers.add(23);
        numbers.add(42);
        numbers.add(745);
        numbers.add(12);
        numbers.add(2);
        numbers.add(11);
        numbers.add(36);
        Collections.sort(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
*/

//Task 7
public class Copy_practice {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Mersedes");
        cars.add("Lamborghini");
        cars.add("Bugatti");
        System.out.println(cars);

        String car = cars.get(0);
        System.out.println("get method : " + car);

        cars.set(0 , "Ferrari");
        System.out.println("set method : " + cars);

        cars.remove(0);
        System.out.println("remove method : " + cars);

        cars.clear();
        System.out.println("clear method : " + cars);

        int x = cars.size();
        System.out.println("list size : " + x);
    }
}


