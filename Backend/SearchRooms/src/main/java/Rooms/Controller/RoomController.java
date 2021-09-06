package Rooms.Controller;
import java.util.List;
import java.util.Optional;

import Rooms.Model.RoomDetails;
import Rooms.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RoomController {


    @Autowired
    RoomService roomService;
    @RequestMapping("/all")
    public List<RoomDetails> returnAll()
    {
        return roomService.returnAll();
    }
    @RequestMapping("/all/{id}")
    public Optional<RoomDetails> getGuest(@PathVariable Integer id)
    {
        return roomService.getRoom(id);
    }
    @RequestMapping(method= RequestMethod.POST,value="/all")
    public void addGuest(@RequestBody RoomDetails Guest)
    {
        roomService.addRoom(Guest);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/all/{id}")
    public void deleteGuest(@PathVariable Integer id)
    {
        roomService.deleteRoom(id);
    }
    @RequestMapping(method=RequestMethod.PUT,value="/all/{id}")
    public void updateGuest(@RequestBody RoomDetails Guest,@PathVariable Integer id)
    {
        roomService.updateRoom(id, Guest);
    }

}