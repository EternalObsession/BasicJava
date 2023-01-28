package basic.start;

public class Basic001 {


    public static void main(String[] args) {
        long start = System.currentTimeMillis();

//        f.setIconImage(new ImageIcon("img\\component\\female.png").getImage());
//      f.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\component\\female.png"));


        long end = System.currentTimeMillis();
        System.out.printf("total:"+(end-start)/1000.00+"S");
    }
}
