//enum levels {
//    LOW, MEDIUM, HIGH;
//}

enum Level {
    LOW, MEDIUM, HIGH;
}

public class LetsDoEnums {
    //static String[] levels = {"Low", "Medium", "High"};

    public static void main(String[] args){
//        System.out.println(levels[0]);
//        System.out.println(levels[1]);
//        System.out.println(levels[2]);

        //System.out.println(levels.HIGH);

        Level l = Level.LOW;

        //System.out.println(l);

        switch (l)
        {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
