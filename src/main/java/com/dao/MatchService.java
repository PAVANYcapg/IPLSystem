package com.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.model.Match;

@Service
public class MatchService {

		@Autowired
		MatchDAO matchdaoimpl;
		
		public void addMatch(Match match) {
			matchdaoimpl.addMatch(match);
		}
		
		public Match findMatch(int id) {
			return matchdaoimpl.findMatch(id);
		}
		
		public List<Match> findAllMatch() {
			return matchdaoimpl.findAllMatch();
		}
		
		public boolean updateMatch(Match match) {
			return matchdaoimpl.updateMatch(match);
		}
		
		public boolean deleteMatch(int id) {
			return matchdaoimpl.deleteMatch(id);
		}
}