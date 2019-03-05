package chapter2.item1;

/**
 * 通过静态方法构造不同的车，好处在于高可阅读性。
 */
public class MakeCarByStaticFactory {
    private static int wheel;
    private static int door;
    private static int ai;
    private static int tv;
//    任何车都有车门和车轮
    public MakeCarByStaticFactory(int wheel , int door) {
        this.wheel=wheel;
        this.door=door;
    }
//    标配只有车门和车轮
    public static MakeCarByStaticFactory standard(int wheel,int door){
        System.out.println("......生产标配.......");
        return new MakeCarByStaticFactory(wheel,door);
    }
//    高配ai有车门、车轮和ai
    public static MakeCarByStaticFactory AIVersion(int wheel,int door,int ai){
        MakeCarByStaticFactory.ai=ai;
        System.out.println("......生产高配ai.......");
        return new MakeCarByStaticFactory(wheel,door);
    }
//    高配tv有车门、车轮和tv
    public static MakeCarByStaticFactory TVVersion(int wheel,int door,int tv){
        MakeCarByStaticFactory.tv=tv;
        System.out.println("......生产高配tv.......");
        return new MakeCarByStaticFactory(wheel,door);
    }

    public static void main(String[] args) {
//        车辆的生产不再依靠创建新的对象，而是通过调用静态方法，函数拥有名字，有利于程序员的识别
        MakeCarByStaticFactory standard=MakeCarByStaticFactory.standard(4,4);
        MakeCarByStaticFactory ai=MakeCarByStaticFactory.AIVersion(4,4,1);
        MakeCarByStaticFactory tv=MakeCarByStaticFactory.TVVersion(4,4,4);
    }
}
