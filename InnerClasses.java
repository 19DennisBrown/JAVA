

class Outer{

    String dub = "Outer class";
    int levelOuter = 1;

    class Inner{
        String dubd = "Inner Class";
        int levelInner = 2;

        public int thisInnerMethod(){
            return levelOuter;
        }
    }
}

class Main{

    public static void main(String[] args){

        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();

        System.out.println(outerObj.dub +", "+ innerObj.dubd);
        System.out.println(innerObj.thisInnerMethod());

        System.out.println("__end__");
    }
}