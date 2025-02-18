class Resource {
    String name;

    Resource(String name) {
        this.name = name;
    }
}
 class DeadlockExample {
    public static void main(String[] args) {
        Resource res1 = new Resource("Resource 1");
        Resource res2 = new Resource("Resource 2");

        Thread t1 = new Thread(() -> {
            synchronized (res1) {
                System.out.println(Thread.currentThread().getName() + " locked " + res1.name);

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (res2) {
                    System.out.println(Thread.currentThread().getName() + " locked " + res2.name);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (res2) {
                System.out.println(Thread.currentThread().getName() + " locked " + res2.name);

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (res1) {
                    System.out.println(Thread.currentThread().getName() + " locked " + res1.name);
                }
            }
        });

        t1.start();
        t2.start();
    }

}
