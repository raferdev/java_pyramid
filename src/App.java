public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i < 10; i++) {
            String text = "";
            for (int y = 1; y <= i; y++) {
                text = text + i;
            }
            System.out.println(text);
        }

    }
}
