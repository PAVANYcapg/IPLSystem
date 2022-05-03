package com.group1.ipl;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.dao.BidderService;
import com.model.Bidder;

import junit.framework.Assert;

@SpringBootTest
class BidderTest1 {
	
	@Autowired
	BidderService bidderService;
	
	@Test
	void testAdd() {
		Bidder bidder=new Bidder();
		bidder.setUserName("Pradeep");
		bidder.setPassword("1234");
		bidder.setName("sathya");
		bidder.setEmail("pradeep123@gmail.com");
		bidder.setPhoneNo("1234567890");
		bidderService.addBidder(bidder);
		
		Bidder to_be_tested =bidderService.findBidder(bidder.getBidderId()); 
		Assert.assertEquals("Pradeep",to_be_tested.getUserName());
		Assert.assertEquals("1234",to_be_tested.getPassword());
		Assert.assertEquals("sathya",to_be_tested.getName());
		Assert.assertEquals("pradeep123@gmail.com",to_be_tested.getEmail());
		Assert.assertEquals("1234567890",to_be_tested.getPhoneNo());
		
	}

	@Test
	void testFind() {
		Bidder bidder1=new Bidder();
		bidder1.setUserName("Pavan");
		bidder1.setPassword("12345");
		bidder1.setName("Kumar");
		bidder1.setEmail("pavan8096@gmail.com");
		bidder1.setPhoneNo("0987456321");
		bidderService.addBidder(bidder1);
		
		Bidder to_be_tested =bidderService.findBidder(bidder1.getBidderId()); 
		Assert.assertEquals("Pavan",to_be_tested.getUserName());
		Assert.assertEquals("12345",to_be_tested.getPassword());
		
	}

	@Test
	void testFindAll() {
		Bidder bidder2 = new Bidder();
		bidder2.setName("Ranjan");
		bidder2.setEmail("Ranjan8096@gmail.com");
		bidder2.setUserName("Ranjan");
		bidder2.setPassword("12345");
		bidder2.setPhoneNo("0987456321");
		bidderService.addBidder(bidder2);

		Bidder bidder3 = new Bidder();
		bidder3.setName("simha");
		bidder3.setEmail("simha8096@gmail.com");
		bidder3.setUserName("simha");
		bidder3.setPassword("12345");
		bidder3.setPhoneNo("0987456321");
		bidderService.addBidder(bidder3);

		List<Bidder> bidderlist = bidderService.findAllBidder();
		Assert.assertEquals(bidderlist.get(1).getUserName(), "Ranjan");

	}

	@Test
	void testUpdate() {
		Bidder bidder4 = bidderService.findBidder(4);
		bidder4.setUserName("Pavan_Updated");
		bidderService.updateBidder(bidder4);
		Bidder bidder4Updated = bidderService.findBidder(4);
		Assert.assertEquals("Pavan_Updated", bidder4Updated.getUserName());
		}

	@Test
	void testDelete() {
       boolean isDelete= bidderService.deleteBidder(1);
       Assert.assertEquals(true,isDelete);
	}

}