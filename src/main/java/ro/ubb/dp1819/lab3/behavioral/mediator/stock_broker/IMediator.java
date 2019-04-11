package ro.ubb.dp1819.lab3.behavioral.mediator.stock_broker;

public interface IMediator {
    public void saleOffer(String stock, int shares, int collCode);
    public void buyOffer(String stock, int shares, int collCode);
    public void addColleague(Broker colleague);
}