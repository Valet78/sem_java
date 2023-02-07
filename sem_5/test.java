package sem_5;

public class test {
    public static void main(String[] args) {
        Point2d point = new Point2d();

        System.out.println(point.GetStr(25, 13));
        System.out.printf("y = %d x = %d\n", point.GetY("12:42"), point.GetX("12:42") );
        
    }
}
