public enum Colors1 {

    GREEN(100, "зеленый",()-> System.out.println("печатаем зеленым")),
    BLUE(200,"синий", ()-> System.out.println("печатаем синим")),
    RED(300,"красный", ()-> System.out.println("печатаем красным")),
    BLACK(400, "черный",()-> System.out.println("печатаем черным"));

    private int colorCode;
    private String name;
    private ColorPrint printer;

    Colors1(int colorCode, String name, ColorPrint printer) {
        this.colorCode = colorCode;
        this.name = name;
        this.printer = printer;
    }

    @Override
    public String toString() {
        return "Colors1{" +
                "colorCode=" + colorCode +
                ", name='" + name + '\'' +
                ", printer=" + printer +
                '}';
    }

    public int getColorCode() {
        return colorCode;
    }

    public String getName() {
        return name;
    }

    public ColorPrint getPrinter() {
        return printer;
    }
}
