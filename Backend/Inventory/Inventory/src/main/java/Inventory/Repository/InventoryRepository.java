package Inventory.Repository;

import Inventory.Model.InventoryDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
@Repository
public interface InventoryRepository  extends MongoRepository<InventoryDetails, Long> {


}
