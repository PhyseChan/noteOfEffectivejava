package chapter2.item2;

/**
 *构建器替代多个构造器。
 */
public class Carbuilder {
    private int wheel;
    private int tv;
    private int ai;
    private String brand;
    private String power;

    /**
     * 静态内部类，作为car的构建器
     */
    public static class builder{
        private int wheel;
        private int tv;
        private int ai;
        private String brand;
        private String power;
//轮子构造器
        public builder wheelBuilder(int val){
            wheel=val;
            return this;
        }
//电视构造器
        public builder tvBuilder(int val){
            tv=val;
            return this;
        }
//ai构造器
        public builder aiBuilder(int val){
            ai=val;
            return this;
        }
//品牌构造器
        public builder brandBuilder(String val){
            brand=val;
            return this;
        }
//动力构造器
        public builder powerBilder(String val){
            power=val;
            return this;
        }
//获取汽车实例
        public Carbuilder getCarInstance(){
            return new Carbuilder(this);
        }
    }

    /**
     * 将构造器私有化，只能通过内部类builder的getCarInstance方法获得carbuilder类
     * @param builder
     */
    private Carbuilder(builder builder){
        wheel=builder.wheel;
        ai=builder.ai;
        tv=builder.tv;
        brand=builder.brand;
        power=builder.power;
    }

    @Override
    public String toString() {
        return "Carbuilder{" +
                "wheel=" + wheel +
                ", tv=" + tv +
                ", ai=" + ai +
                ", brand='" + brand + '\'' +
                ", power='" + power + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Carbuilder carbuilder= new Carbuilder.builder().aiBuilder(1).brandBuilder("benz").wheelBuilder(4).tvBuilder(1).powerBilder("electric").getCarInstance();
        System.out.println(carbuilder.toString());
    }
}
