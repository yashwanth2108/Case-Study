package Rooms.Service;
import Rooms.Repository.RoomRepository;
import Rooms.Model.RoomDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class RoomService {


    @Autowired
    private RoomRepository roomRepository;


    @Autowired
    SequenceGeneratorService sequenceGeneratorService;


    public List<RoomDetails> returnAll()
    {
        List<RoomDetails> Rooms = new ArrayList<>();
        roomRepository.findAll()
                .forEach(Rooms::add);
        return Rooms;
    }


    public Optional<RoomDetails> getRoom(Integer id)
    {
        return roomRepository.findById(id);
    }
    public void addRoom(RoomDetails Room)
    {
        Room.setId(sequenceGeneratorService.generateSequence(RoomDetails.SEQUENCE_NAME));
        roomRepository.save(Room);
    }
    public void deleteRoom(Integer id)
    {
        roomRepository.deleteById(id);
    }
    public void updateRoom(Integer id,RoomDetails Room)
    {
        roomRepository.save(Room);
    }

}