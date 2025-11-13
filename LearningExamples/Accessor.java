package LearningExamples;

public class Accessor {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass.returnX());
    }


}
