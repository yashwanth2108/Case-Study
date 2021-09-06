package com.IssueBill.IssueBill;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.IssueBill.IssueBill.IssueBillDetails;
import com.IssueBill.IssueBill.IssueBillService;


@RestController
public class IssueBillController {
	@Autowired
	IssueBillService issueBillService;


    @RequestMapping("/all")
    public List<IssueBillDetails> returnAll()
    {
        return issueBillService.returnAll();
    }
    @RequestMapping("/all/{id}")
    public Optional<IssueBillDetails> getGuest(@PathVariable Long id)
    {
        return issueBillService.getIssueBill(id);
    }
    @RequestMapping(method= RequestMethod.POST,value="/all")
    public void addGuest(@RequestBody IssueBillDetails Guest)
    {
    	issueBillService.addIssueBill(Guest);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/all/{id}")
    public void deleteGuest(@PathVariable Long id)
    {
    	issueBillService.deleteIssueBill(id);
    }
    @RequestMapping(method=RequestMethod.PUT,value="/all/{id}")
    public void updateGuest(@RequestBody IssueBillDetails Guest,@PathVariable Long id)
    {
    	issueBillService.updateIssueBill(id, Guest);
    }


}
