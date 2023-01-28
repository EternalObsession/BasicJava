package basic.start;

public class Basic001 {


    public static void main(String[] args) {
        long start = System.currentTimeMillis();

//        f.setIconImage(new ImageIcon("img\\component\\female.png").getImage());
//      f.setIconImage(Toolkit.getDefaultToolkit().getImage("img\\component\\female.png"));
        int j=0;
        for(int i=1;i<=1000000;i++){
            j=i;
        }

        long end = System.currentTimeMillis();
        System.out.println("total:"+j+" ºÄÊ±£º"+(end-start) +"ºÁÃë");
    }
}
