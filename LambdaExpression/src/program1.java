public class program1 {
    public static void main(String[] args) {
        Runnable ru = () -> {
            System.out.println("Lambda");
        };

        ru.run();
    }
}
