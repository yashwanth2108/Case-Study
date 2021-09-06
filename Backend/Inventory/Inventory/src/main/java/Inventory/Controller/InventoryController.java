package Inventory.Controller;


import Inventory.Model.InventoryDetails;
import Inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins ="http://localhost:3000/")
@RestController
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @RequestMapping("/allIn")
    public List<InventoryDetails> returnAll()
    {
        return inventoryService.returnAll();
    }
    @RequestMapping("/allIn/{id}")
    public Optional<InventoryDetails> getInventory(@PathVariable Long id)
    {
        return inventoryService.getInventory(id);
    }
    @RequestMapping(method= RequestMethod.POST,value="/allIn")
    public void addInventory(@RequestBody InventoryDetails Inventory)
    {
        inventoryService.addInventory(Inventory);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/allIn/{id}")
    public void deleteInventory(@PathVariable Long id)
    {
        inventoryService.deleteInventory(id);
    }
    @RequestMapping(method=RequestMethod.PUT,value="/allIn/{id}")
    public void updateInventory(@RequestBody InventoryDetails Inventory,@PathVariable Long id)
    {
        inventoryService.updateInventory(id, Inventory);
    }



}
