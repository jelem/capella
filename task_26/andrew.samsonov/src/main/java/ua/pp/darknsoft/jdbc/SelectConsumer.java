package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Consumer;

import java.util.List;

public interface SelectConsumer {

  Consumer getConsumerById(int consumerId);

  List<Consumer> getConsumerByFirstName(String firstName);

  List<Consumer> getConsumerByLastName(String lastName);

}
