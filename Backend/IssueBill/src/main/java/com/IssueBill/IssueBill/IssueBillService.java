package com.IssueBill.IssueBill;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IssueBill.IssueBill.IssueBillDetails;
import com.IssueBill.IssueBill.IssueBillRepository;


@Service
public class IssueBillService {
	 @Autowired
	    private IssueBillRepository issueBillRepository;


	    public List<IssueBillDetails> returnAll()
	    {
	        List<IssueBillDetails> Reservations = new ArrayList<>();
	        issueBillRepository.findAll()
	        .forEach(Reservations::add);
	        return Reservations;
	    }


	    public Optional<IssueBillDetails> getIssueBill(Long id)
	    {
	        return issueBillRepository.findById(id);
	    }
	    public void addIssueBill(IssueBillDetails Guest)
	    {
	    	issueBillRepository.save(Guest);
	    }
	    public void deleteIssueBill(Long id)
	    {
	    	issueBillRepository.deleteById(id);
	    }
	    public void updateIssueBill(Long id,IssueBillDetails reservation)
	    {
	    	issueBillRepository.save(reservation);
	    }



}
