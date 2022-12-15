package emlakcepte.dao;

import java.util.ArrayList;
import java.util.List;

import emlakcepte.model.Search;
import emlakcepte.model.User;

public class SearchDao {

	
	private static List<Search> savedSearchList = new ArrayList<>();
	
	public void saveSearch(Search search) {
		savedSearchList.add(search);
	}
}
