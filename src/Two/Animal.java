package Two;

public class Animal {
    private static String publicField = "나는 퍼블릭 하다.";
}

class Dog extends Animal{
    String breed;
    Dog(){
        System.out.println(publicField);
    }
}
