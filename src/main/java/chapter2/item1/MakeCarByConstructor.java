package chapter2.item1;

/**
 * 车构造类
 * 通过给不同的构造器啊传入不同的参数来生产不同的车
 * 缺点在于麻烦，代码维护代价太高，可阅读性差导致调用时需要花费大量时间理解构造器的作用。
 */
public class MakeCarByConstructor {
    private int wheel;
    private int door;
    private int ai;
    private int tv;
    //    一般的车，只需要车轮和车门
    public MakeCarByConstructor(int wheel , int door) {
        this.wheel=wheel;
        this.door=door;
    }
    //    新型车，可选择高配ai或者是高配商务
    public MakeCarByConstructor(int wheel,int door,int tv,int ai) {
        this.wheel=wheel;
        this.door=door;
        this.tv=tv;
        this.ai=ai;
    }
}
