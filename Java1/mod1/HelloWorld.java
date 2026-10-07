public class HelloWorld {
    private static class Greeting {
        public void sayHello() {
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.sayHello();
    }
}