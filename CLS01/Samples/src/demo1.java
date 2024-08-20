public class demo1 {
    int sum(int i, int j){
        return i+j;
    }
    public static void main(String[] args) {
        demo1 obj=new demo1();
        System.out.println("Start");
        int res=obj.sum(3,4);
        System.out.println(res);
        res=obj.sum(9, 10);
        System.out.println(res);
        System.out.println(obj.sum(6,7));
        System.out.println("End");
    }
}
