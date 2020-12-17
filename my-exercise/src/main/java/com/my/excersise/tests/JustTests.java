package com.my.excersise.tests;

public class JustTests {
    public static void main(String[] args) {
//        FoodOrder foodOrder = new FoodOrder(new HealthyShop(85,2), "milk", 23);
//        FoodOrder foodOrder1 = new FoodOrder(new HealthyShop(20,1), "Pad thai", 36);
//        FoodOrder foodOrder2 = new FoodOrder(new ExtraFoodShop(41), "pasta", 12);
//        FoodOrder foodOrder3 = new FoodOrder(new GlutenFreeShop(41), "chicken", 12);
//
//        OrderProcessor orderProcessor = new OrderProcessor(new MailInformation(), new ProviderOrderService());
//        orderProcessor.process(foodOrder);
//
//        System.out.println();
//        orderProcessor.process(foodOrder1);
//
//        System.out.println();
//        orderProcessor.process(foodOrder2);
//
//        System.out.println();
//        orderProcessor.process(foodOrder3);
    }
//}
//class OrderProcessor {
//
//    private final InformationService informationService;
//    private final OrderService orderService;
//
//    public OrderProcessor(InformationService informationService, OrderService orderService) {
//        this.informationService = informationService;
//        this.orderService = orderService;
//    }
//
//    public void process(final FoodOrder foodOrder) {
//        orderService.informProvider(foodOrder.getProvider(), foodOrder);
//        boolean isOrdered= orderService.order(foodOrder.getProvider(), foodOrder.getProduct(), foodOrder.getQuantity());
//        if (isOrdered) {
//            informationService.inform(foodOrder.getProvider(), foodOrder);
//            new SaleDTo(foodOrder, true);
//        } else {
//            new SaleDTo(foodOrder, false);
//        }
//    }
//}
//class FoodOrder {
//    private final Provider provider;
//    private final String product;
//    private final double quantity;
//
//    public FoodOrder(final Provider provider, final String product, final double quantity) {
//        this.provider = provider;
//        this.product = product;
//        this.quantity = quantity;
//    }
//
//    public Provider getProvider() {
//        return provider;
//    }
//
//    public String getProduct() {
//        return product;
//    }
//
//    public double getQuantity() {
//        return quantity;
//    }
//}
//class ExtraFoodShop implements Provider {
//
//    private final double price;
//    public String NAME = "Extra Food Shop";
//
//    public ExtraFoodShop(final double price) {
//        this.price = price;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public boolean process(FoodOrder foodOrder){
//        System.out.println("Zamówienie ze sklepu " + NAME + " rozpoczęte...");
//        double standardPayment = foodOrder.getQuantity() * getPrice();
//        System.out.println( "Cena za zamówienie: " + standardPayment + " zł");
//        return true;
//    }
//}
//interface Provider {
//    boolean process(FoodOrder foodOrder);
//}
//interface OrderService {
//    boolean order(Provider provider, String product, double amount);
//    void informProvider(Provider provider, FoodOrder foodOrder)
//}
//interface InformationService {
//    void inform(Provider provider, FoodOrder foodOrder);
//}
//class SaleDTo {
//    FoodOrder foodOrder;
//    boolean isOrdered;
//
//    public SaleDTo(FoodOrder foodOrder, boolean isOrdered) {
//        this.foodOrder = foodOrder;
//        this.isOrdered = isOrdered;
//    }
//}
//
//
}
