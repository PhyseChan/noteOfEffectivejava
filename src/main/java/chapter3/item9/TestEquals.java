package chapter3.item9;

/**
 * 测试equals函数
 */
public class TestEquals {

    public String print(){
        return this.toString();
    }

    /**
     * 虽然都是同一个类但是equals方法的结果却是false
     * @param args
     */
    public static void main(String[] args) {
        TestEquals x=new TestEquals();
        TestEquals y=new TestEquals();
        System.out.println(x.equals(y)+"\n"+x.print()+"\n"+y.print());
    }
}
