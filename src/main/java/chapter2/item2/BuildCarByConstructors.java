package chapter2.item2;

public class BuildCarByConstructors {
    private int wheel;
    private int tv;
    private int ai;
    private String brand;
    private String power;
    //只要轮子的汽车
    public BuildCarByConstructors(int wheel) {
        this.wheel = wheel;
    }
    //只要轮子和电视的汽车
    public BuildCarByConstructors(int wheel, int tv) {
        this.wheel = wheel;
        this.tv = tv;
    }
    //轮子，电视和ai的汽车
    public BuildCarByConstructors(int wheel, int tv, int ai) {
        this.wheel = wheel;
        this.tv = tv;
        this.ai = ai;
    }
    //规定了品牌，动力，的有轮子有ai有电视的汽车
    public BuildCarByConstructors(int wheel, int tv, int ai, String brand, String power) {
        this.wheel = wheel;
        this.tv = tv;
        this.ai = ai;
        this.brand = brand;
        this.power = power;
    }

}
