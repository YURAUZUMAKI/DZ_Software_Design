package Kee;

public class Main {
    public static void main(String[] args){
        LinkedList f = new LinkedList();
            f.add(1);
            f.add(1);
            f.add(1);
        LinkedList f1 = new LinkedList();
            f1.add(2);
            f1.add(3);
            f1.add(4);
        LinkedList f2 = new LinkedList();
        for(int i = 0;i<f.getSize();i++) {
        f2.add(f.head.data + f1.head.data);
        }
        f2.print();
    }
}
