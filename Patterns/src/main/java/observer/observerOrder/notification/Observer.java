package observer.observerOrder.notification;

import observer.observerOrder.order.Order;

public interface Observer {
    public void changeOrderStatus(Order order);
}
