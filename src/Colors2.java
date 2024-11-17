public enum Colors2 {
    GREEN{
        @Override
        public void print() {
            System.out.println("печатаем зеленым");
        }
    },
    BLUE {
        @Override
        public void print() {
            System.out.println("печатаем синим");
        }
    },
    RED {
        @Override
        public void print() {
            System.out.println("печатаем красным");
        }
    },
    BLACK {
        @Override
        public void print() {
            System.out.println("печатаем чернвм");
        }
    };

    public abstract void print();

}
