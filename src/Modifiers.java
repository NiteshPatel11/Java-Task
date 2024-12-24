public class Modifiers {

        private int p = 5;

        private void privateMethod() {
            System.out.println("This is a private method.");
        }

        public static void main(String[] args) {
            Modifiers obj = new Modifiers();
            System.out.println(obj.p);
            obj.privateMethod();
    }
}
