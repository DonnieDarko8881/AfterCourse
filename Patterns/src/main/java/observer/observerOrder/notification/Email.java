package observer.observerOrder.notification;

import observer.observerOrder.order.Order;

public class Email implements Observer {
    public void changeOrderStatus(Order order) {
        System.out.println("Mail" + order.toString());
    }
}
