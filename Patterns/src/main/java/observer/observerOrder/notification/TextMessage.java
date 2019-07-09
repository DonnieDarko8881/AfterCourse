package observer.observerOrder.notification;

import observer.observerOrder.order.Order;

public class TextMessage implements Observer {
    public void changeOrderStatus(Order order) {
        System.out.println("SMS - " + order.toString());
    }
}
