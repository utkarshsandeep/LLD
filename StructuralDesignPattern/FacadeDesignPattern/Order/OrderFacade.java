package SystemDesign.LLD.DesignPatterns.StructuralDesignPattern.FacadeDesignPattern.Order;

public class OrderFacade {
    ProductDAO productDAO;
    Payment payment;
    Invoice invoice;
    Notification notification;

    public OrderFacade() {
        productDAO = new ProductDAO();
        payment = new Payment();
        invoice = new Invoice();
        notification = new Notification();
    }

    public void placeOrder() {
        productDAO.getOrder();
        payment.makePayment();
        invoice.generateInvoice();
        notification.sendNotification();
    }
}
