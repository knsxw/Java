class Box {
    double width;
    double height;
    double depth;
}

class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        vol = myBox1.width * myBox1.depth * myBox1.height;
        System.out.println("Volume is " + vol);

        vol = myBox2.width * myBox2.depth * myBox2.height;
        System.out.println("Volume is " + vol);
    }
}
