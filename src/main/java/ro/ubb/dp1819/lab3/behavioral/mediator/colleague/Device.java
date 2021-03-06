package ro.ubb.dp1819.lab3.behavioral.mediator.colleague;

public abstract class Device {
  private Mediator mediator;

  public Device(Mediator m) { mediator = m; }

  public void send(String message) { mediator.send(message, this); }

  public Mediator getMediator() { return mediator; }

  public abstract void receive(String message);
}
