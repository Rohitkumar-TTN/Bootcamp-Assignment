
    class Singleton {
        private static Singleton instance;
        private Singleton() {}
        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
        public void displayMessage() {
            System.out.println("Hello I am the Singleton instance");
        }
    }
     class SingletonPatternExample {
        public static void main(String[] args) {
            Singleton singleton1 = Singleton.getInstance();
            Singleton singleton2 = Singleton.getInstance();
            singleton1.displayMessage();
            singleton2.displayMessage();
            System.out.println("Are both instances the same? " + (singleton1 == singleton2));
        }
    }


