package core.basesyntax.storage;

import java.util.Map;

public interface FruitStorage {
    int getFruitQuantity(String fruit);

    void updateFruitQuantity(String fruit, int quantity);

    Map<String, Integer> getAllFruits();

    void addFruits(String fruit, int quantity);
}