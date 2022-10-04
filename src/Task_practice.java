import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Problem 1
/*
public class Task_practice {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Cyanta");
        colors.add("Magenta");
        colors.add("Yellow");
        colors.add("Black");
        System.out.println(colors);
    }
}
*/

//Problem 2
/*
public class Task_practice {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Cyanta");
        colors.add("Magenta");
        colors.add("Yellow");
        colors.add("Black");
        colors.add(0,"Purple");
        System.out.println(colors);
    }
}
*/

//Problem 3
/*
public class Task_practice {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Cyanta");
        colors.add("Magenta");
        colors.add("Yellow");
        colors.add("Black");
        colors.add(0,"Purple");
        String color = colors.get(5);
        System.out.println("get method : " + color);
        for (int i = 0 ; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        System.out.println(colors);
    }
}
*/

//Problem 4
/*
public class Task_practice {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Cyanta");
        colors.add("Magenta");
        colors.add("Yellow");
        colors.add("Black");
        colors.add(0,"Purple");
        colors.set(0 , "Pink");
        System.out.println("set method : " + colors);
        System.out.println(colors);
    }
}
*/

//Problem 5
/*
public class Task_practice {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Cyanta");
        colors.add("Magenta");
        colors.add("Yellow");
        colors.add("Black");
        colors.add(0,"Purple");
        colors.remove(2);
        System.out.println("remove method : " + colors);
    }
}
*/

//Problem 6
/*
public class Task_practice {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Cyanta");
        colors.add("Magenta");
        colors.add("Yellow");
        colors.add("Black");
        colors.add(0,"Purple");
        if (colors.contains("Magenta")) {
            System.out.println("Element found");
            System.out.println("The index of the Magenta in ArrayList is: " + colors.indexOf("Magenta"));
        }
        else {
            System.out.println("There is no such element");
        }
    }
}
*/

//Problem 7
/*
public class Task_practice {
    public static void main(String[] args) {
        ArrayList<String> colorsRGB = new ArrayList<String>();
        colorsRGB.add("Red");
        colorsRGB.add("Green");
        colorsRGB.add("Blue");
        ArrayList<String> colorsCMYK = colorsRGB;
        System.out.println(colorsRGB);
        System.out.println(colorsCMYK);
    }
}
*/

//Problem 8
/*
public class Task_practice {
    public static void main(String[] args) {
        ArrayList<String> colorsRGB = new ArrayList<String>();
        colorsRGB.add("Red");
        colorsRGB.add("Green");
        colorsRGB.add("Blue");
        System.out.println("Before Shuffling : " + colorsRGB);
        Collections.shuffle(colorsRGB);
        System.out.println("After Shuffling : " + colorsRGB);
    }
}
*/

//Problem 9
public class Task_practice {
    public static void main(String[] args) {
        ArrayList<String> colorsRGB = new ArrayList<String>();
        colorsRGB.add("Red");
        colorsRGB.add("Green");
        colorsRGB.add("Blue");
        System.out.println("Before Reverse : " + colorsRGB);
        Collections.reverse(colorsRGB);
        System.out.println("After Reverse : " + colorsRGB);
    }
}
