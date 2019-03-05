package chapter3.item9;

public class testhashcode {

    /**
     * 内部类DonotOverrideEquals
     * 不重写任何的方法
     */
    class DonotOverrideEquals{
        private String valString;
        private int valInt;

        public DonotOverrideEquals(String valString, int valInt) {
            this.valString = valString;
            this.valInt = valInt;
        }
    }

    /**
     * 内部类OverrideEquals
     * 只重写Equals方法
     */
    class OverrideEquals{
        private String valString;
        private int valInt;

        public OverrideEquals(String valString, int valInt) {
            this.valString = valString;
            this.valInt = valInt;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj!=null&&obj.getClass()==this.getClass()){
                OverrideEquals oe=(OverrideEquals)obj;
                if(oe.valInt==valInt&&oe.valString==valString){
                    return true;
                }else {
                    return false;
                }
            }else{
                return false;
            }
        }
    }

    /**
     * 内部类OverrideEqualsAndHashcode
     * 重写Equals和Hashcode方法
     */
    class OverrideEqualsAndHashcode{
        private String valString;
        private int valInt;

        public OverrideEqualsAndHashcode(String valString, int valInt) {
            this.valString = valString;
            this.valInt = valInt;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj!=null&&obj.getClass()==this.getClass()){
                OverrideEqualsAndHashcode oe=(OverrideEqualsAndHashcode)obj;
                if(oe.valInt==valInt&&oe.valString==valString){
                    return true;
                }else {
                    return false;
                }
            }else{
                return false;
            }
        }

        /**
         * 根据hashcode的文档要遵守
         * byte、char、short计算为（int）val
         * 根据result = 31 * result + c 合并到result中。
         * @return
         */
        @Override
        public int hashCode() {
            int result =  7;
            int valString=0;
            /*将valStirng转换为字节流，再转成int类型*/
            byte[] bytes=this.valString.getBytes();
            for(int i =0;i< bytes.length;i++){
                valString=bytes[i]*(int)Math.pow(10,i)+valString;
            }
            result = (result*31+valString) *this.valInt;
            return result;
        }
    }

    public static void main(String[] args) {

        DonotOverrideEquals dA=new testhashcode().new DonotOverrideEquals("test1",1);
        DonotOverrideEquals dB=new testhashcode().new DonotOverrideEquals("test1",1);
        DonotOverrideEquals dC=new testhashcode().new DonotOverrideEquals("test2",2);
        OverrideEquals oA=new testhashcode().new OverrideEquals("test1",1);
        OverrideEquals oB=new testhashcode().new OverrideEquals("test1",1);
        OverrideEquals oC=new testhashcode().new OverrideEquals("test2",2);
        OverrideEqualsAndHashcode oehA=new testhashcode().new OverrideEqualsAndHashcode("test1",1);
        OverrideEqualsAndHashcode oehB=new testhashcode().new OverrideEqualsAndHashcode("test1",1);
        OverrideEqualsAndHashcode oehC=new testhashcode().new OverrideEqualsAndHashcode("test2",2);
        System.out.println("do not override equals:");
        System.out.println("equals:"+dA.equals(dB)+"\t"+"dA hashcode:"+dA.hashCode()+"\t"+"dB hashcode:"+dB.hashCode());
        System.out.println("equals:"+dA.equals(dC)+"\t"+"dA hashcode:"+dA.hashCode()+"\t"+"dC hashcode:"+dC.hashCode());
        System.out.println("\n"+"override equals:");
        System.out.println("equals:"+oA.equals(oB)+"\t"+"oA hashcode:"+oA.hashCode()+"\t"+"oB hashcode:"+oB.hashCode());
        System.out.println("equals:"+oA.equals(oC)+"\t"+"oA hashcode:"+oA.hashCode()+"\t"+"oC hashcode:"+oC.hashCode());
        System.out.println("\n"+"override equals and hashcode:");
        System.out.println("equals:"+oehA.equals(oehB)+"\t"+"oehA hashcode:"+oehA.hashCode()+"\t"+"oehB hashcode:"+oehB.hashCode());
        System.out.println("equals:"+oehA.equals(oehC)+"\t"+"oehA hashcode:"+oehA.hashCode()+"\t"+"oehC hashcode:"+oehC.hashCode());
    }
}
