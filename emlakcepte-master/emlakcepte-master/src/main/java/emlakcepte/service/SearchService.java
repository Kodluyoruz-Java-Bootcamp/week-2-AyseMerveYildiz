package emlakcepte.service;


import emlakcepte.dao.SearchDao;
import emlakcepte.model.Search;
import emlakcepte.model.User;

public class SearchService {
	
	private SearchDao searchDao = new SearchDao();
	
	public void saveSearch(Search search) {		
		
		searchDao.saveSearch(search);
		System.out.println("saveSearch :: " +search.getSearchHistory());
			
					
	}

}
