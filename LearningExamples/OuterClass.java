package LearningExamples;

public class OuterClass {
    int x = 5;

    class InnerClass {
        public int returnX() {
            return x;
        }
    }
}
