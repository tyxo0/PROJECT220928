public class GarbageEx {
        public static void main(String[] args) {
            String a = new String("Good");
            String b = new String("Bad");
            String c = new String("Normal");
            String d, e;
            a = null; // new String("Good"); 가비지
            d = c;
            c = null; //new String("Normal"); 가비지
        }
} 