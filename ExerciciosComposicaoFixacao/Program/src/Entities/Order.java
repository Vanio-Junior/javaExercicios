package Entities;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment = new Date();
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    DateTimeFormatter fmtPedido = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

    public Order(OrderStatus status,Client client) {
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        double total = 0;
        for(OrderItem item : items) {
            total += item.subTotal();
        }
        return total;
    }

    public String toString() {
        LocalDateTime dataPedido = LocalDateTime.ofInstant(moment.toInstant(), ZoneId.systemDefault());
        StringBuilder sb = new StringBuilder();
        sb.append("Order Summary: " + "\n");
        sb.append("Order Moment: " + fmtPedido.format(dataPedido)+ "\n");
        sb.append("Order Status: " + status + "\n");
        sb.append("Order Client: " + client.getName() + "\n");
        sb.append("Order Items: " + "\n");
        for(OrderItem item : items) {
            sb.append(item.toString());
        }
        sb.append("Total price: $" + total() + "\n");
        return sb.toString();
    }
}
