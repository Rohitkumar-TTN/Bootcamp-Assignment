class SharedResource {
    volatile boolean flag = false;

    public void setFlagTrue() {
        System.out.println("Writer Thread: Changing flag to true.");
        flag = true;
    }
}
 class VolatileExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread reader = new Thread(() -> {
            System.out.println("Reader Thread: Waiting for flag to change...");
            while (!resource.flag) {
            }
            System.out.println("Reader Thread: Detected flag change!");
        });

        Thread writer = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            resource.setFlagTrue();
        });

        reader.start();
        writer.start();
    }
}
