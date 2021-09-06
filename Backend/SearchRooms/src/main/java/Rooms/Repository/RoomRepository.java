package Rooms.Repository;

import Rooms.Model.RoomDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



@Repository
@Component
public interface RoomRepository extends MongoRepository<RoomDetails,Integer> {

}
