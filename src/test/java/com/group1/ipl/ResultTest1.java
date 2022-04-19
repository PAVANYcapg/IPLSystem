package com.group1.ipl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.ResultService;
import com.model.Result;

import java.util.List;
import junit.framework.Assert;
@SpringBootTest
class ResultTest1 {

	@Autowired
	ResultService resultservice;
	
	@Test
	void testAdd() {
		Result result = new Result();
		result.setFirstTeam("LSG");
		result.setSecondTeam("CSK");
		result.setThirdTeam("MI");
		resultservice.add(result);
		
		Result result_to_be_tested = resultservice.findTeam(0);
		Assert.assertEquals("LSG", result_to_be_tested.getFirstTeam());
		Assert.assertEquals("CSK", result_to_be_tested.getSecondTeam());
		Assert.assertEquals("MI", result_to_be_tested.getThirdTeam());
	}

	@Test
	void testFind() {
		Result result = new Result();
		result.setFirstTeam("KKR");
		result.setSecondTeam("DC");
		result.setThirdTeam("RR");
		resultservice.add(result);
		
		Result result_to_be_tested = resultservice.findTeam(0);
		Assert.assertEquals("KKR", result_to_be_tested.getFirstTeam());
		Assert.assertEquals("DC", result_to_be_tested.getSecondTeam());
		Assert.assertEquals("RR", result_to_be_tested.getThirdTeam());
     }

	@Test
	void testFindAll() {
		Result result = new Result();
		result.setFirstTeam("RCB");
		result.setSecondTeam("CSK");
		result.setThirdTeam("MI");
		resultservice.add(result);
		
		List<Result> add =  resultservice.findAllTeam();
		Assert.assertEquals("RCB", add.get(1).getFirstTeam());
		
	}
     		
		

	@Test
	void testUpdate() {
		Result result=new Result();
		result.setFirstTeam("SRH");
		resultservice.add(result);
		resultservice.update(result);

		Assert.assertEquals(true, resultservice.update(result));
	}

	@Test
	void testDelete() {
		resultservice.delete(2);
		Result result1 = resultservice.findTeam(2);

		Assert.assertNull(result1);
		
	}

	//private Object Result(int i) {
		// TODO Auto-generated method stub
		//return null;
	//}

}