package chapter3.item8;

/**
 * 假设书本类，重写其中的equals方法
 */
public final class Book {
   private  final  String s;

    public Book(String s) {
        this.s = s;
    }

    /**
     * 通过书名判断两本书是否是相等的
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            return s.equalsIgnoreCase(((Book) obj).s);
        }
        if (obj instanceof String)
            return s.equalsIgnoreCase((String) obj);
        return false;
    }

    public static void main(String[] args) {
        Book b1=new Book("Effective java");
        Book b2=new Book("Effective java");

        System.out.println(b1.equals("Effective java"));
        System.out.println(b1.equals(b2));
        /*String自身的equals方法并没有被重写*/
        System.out.println("Effective java".equals(b1));
    }
}
