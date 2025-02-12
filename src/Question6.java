public class Question6 {
    public enum OrderStatus {
        PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED, REFUNDED
    }

    public static String processOrderStatus(OrderStatus status) {
     return switch (status) {
            case PENDING -> "Order is awaiting confirmation.";
            case PROCESSING -> "Order is being prepared.";
            case SHIPPED -> "Order has been dispatched.";
            case DELIVERED -> "Order has been successfully delivered.";
            case CANCELLED -> "Order has been canceled.";
            case REFUNDED -> {
                String message = "Refund has been issued for the order.";
                yield message;
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(processOrderStatus(OrderStatus.PENDING));
        System.out.println(processOrderStatus(OrderStatus.PROCESSING));
        System.out.println(processOrderStatus(OrderStatus.SHIPPED));
        System.out.println(processOrderStatus(OrderStatus.DELIVERED));
        System.out.println(processOrderStatus(OrderStatus.CANCELLED));
        System.out.println(processOrderStatus(OrderStatus.REFUNDED));
    }
}
