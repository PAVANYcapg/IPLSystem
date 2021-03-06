package com.group1.ipl;



import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.TeamService;
import com.model.Team;

import junit.framework.Assert;

@SpringBootTest
class TeamTest1 {
	
	@Autowired
	TeamService teamservice;

	@Test
	void testAdd() {
		Team team = new Team();
		team.setTname("Chithira");
		team.setPoints(50);
		team.setStatistics("GOOD");
		team.setRanking(1);
		teamservice.addTeam(team);
		
		Team team_to_be_tested=teamservice.findTeam(team.getTeamid());
		Assert.assertEquals("Chithira",team_to_be_tested.getTname());
		Assert.assertEquals(50, team_to_be_tested.getPoints());
		Assert.assertEquals("GOOD", team_to_be_tested.getStatistics());
		Assert.assertEquals(1, team_to_be_tested.getRanking());
	}

	@Test
	void testFindTeam() {
		Team team1 = new Team();
		team1.setTname("P Nair");
		team1.setPoints(100);
		team1.setStatistics("GOOD");
		team1.setRanking(2);
		teamservice.addTeam(team1);
		
		Team team_to_be_tested=teamservice.findTeam(team1.getTeamid());
		Assert.assertEquals("P Nair",team_to_be_tested.getTname());
		Assert.assertEquals(100, team_to_be_tested.getPoints());
		Assert.assertEquals("GOOD", team_to_be_tested.getStatistics());
		Assert.assertEquals(2, team_to_be_tested.getRanking());
		
	}

	@Test
	void testFindAllTeam() {
		Team team2 = new Team();
		team2.setTname("Aishu");
		team2.setPoints(150);
		team2.setStatistics("GOOD");
		team2.setRanking(3);
		teamservice.addTeam(team2);
		
		Team team3 = new Team();
		team3.setTname("Athira");
		team3.setPoints(200);
		team3.setStatistics("GOOD");
		team3.setRanking(4);
		teamservice.addTeam(team3);
		
		List<Team> teamlist=teamservice.findAllTeam();
		
		Assert.assertEquals(teamlist.get(1).getPoints(), 150);
	}

	@Test
	void testUpdate() {
		Team team4 = new Team();
		team4.setTname("Anu");
		team4.setPoints(180);
		team4.setStatistics("GOOD");
		team4.setRanking(5);
		teamservice.addTeam(team4);
		team4.setTeamid(1);
		
		Assert.assertEquals(true,teamservice.updateTeam(team4 ));
	}

	@Test
	void testDelete() {
		Team team = teamservice.findTeam(2);
		teamservice.deleteTeam(team.getTeamid());
		
		Team team5 =teamservice.findTeam(2);
		Assert.assertNull(team5);
	}

}