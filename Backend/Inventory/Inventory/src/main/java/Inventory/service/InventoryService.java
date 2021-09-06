package Inventory.service;


import Inventory.Model.InventoryDetails;
import Inventory.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;
    @Autowired
    private  SequenceGeneratorService sequenceGeneratorService;


    public List<InventoryDetails> returnAll() {
        List<InventoryDetails> Items = new ArrayList<>();
        inventoryRepository.findAll()
                .forEach(Items::add);
        return Items;
    }


    public Optional<InventoryDetails> getInventory(Long id) {

        return inventoryRepository.findById(id);
    }

    public void addInventory(InventoryDetails Inventory) {
        Inventory.setId(sequenceGeneratorService.generateSequence(InventoryDetails.SEQUENCE_NAME));
        inventoryRepository.save(Inventory);
    }

    public void deleteInventory(Long id) {
        inventoryRepository.deleteById(id);
    }

    public void updateInventory(Long id, InventoryDetails Inventory) {
        inventoryRepository.save(Inventory);
    }


}
