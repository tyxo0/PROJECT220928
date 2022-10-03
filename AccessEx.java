class Sample {
        public int a;
        private int b;
        int c;
    }
    public class AccessEx {
        public static void main(String[] args) {
            Sample aClass = new Sample();
            aClass.a = 10;
            //aClass.b = 10; //private로 선언한 멤버에 접근 불가능
            aClass.c = 10;
        }
}
