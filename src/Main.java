public class Main {
    public static void main(String[] args) {
        Colors[] values = Colors.values();

        for (Colors c:values){
            System.out.println(c);
        }

        Colors green = Colors.valueOf("GREEN");

        Colors1 red = Colors1.RED;
        colorsMethod(Colors1.BLACK);

        Colors2 black = Colors2.RED;
        black.print();


    }

    public static void colorsMethod(Colors1 color){
        System.out.println(color.getColorCode());
        System.out.println(color.getName());
        color.getPrinter().print();
    }
}