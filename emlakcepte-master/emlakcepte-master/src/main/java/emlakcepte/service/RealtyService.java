package emlakcepte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emlakcepte.dao.RealtyDao;
import emlakcepte.model.PropertyType;
import emlakcepte.model.Realty;
import emlakcepte.model.RealtyType;
import emlakcepte.model.User;
import emlakcepte.model.UserType;

@Service
public class RealtyService {

	private RealtyDao realtyDao = new RealtyDao();

	@Autowired // injection
	private UserService userService;

	public void createRealty(Realty realty) {

		// userService.printAllUser();

		if (UserType.INDIVIDUAL.equals(realty.getUser().getType())) {
			

			System.out.println("Bireysel kullanıclar en fazla 5 ilan girebilir.");
		}

		realtyDao.saveRealty(realty);
		System.out.println("createRealty :: " + realty.getTitle());
	}

	public List<Realty> getAll() {
		return realtyDao.findAll();
	}

	public void printAll(List<Realty> realtList) {
		realtList.forEach(realty -> System.out.println(realty));
	}

	public void getAllByProvince(String province) {

		getAll().stream().filter(realty -> realty.getProvince().equals(province))
				// .count();
				.forEach(realty -> System.out.println(realty));

	}

	public List<Realty> getAllByUserName(User user) {
		return getAll().stream().filter(realty -> realty.getUser().getMail().equals(user.getMail())).toList();
	}

	public List<Realty> getActiveRealtyByUserName(User user) {

		return getAll().stream().filter(realty -> realty.getUser().getName().equals(user.getName()))
				.filter(realty -> RealtyType.ACTIVE.equals(realty.getStatus())).toList();

	}

	public void publishReality(Realty realty) {

		if (PropertyType.HOUSING.equals(realty.getPropertyTpe())) {
			System.out.println("Bireysel kullanıclar en fazla 3 ilan girebilir.");
		}
		realtyDao.publishRealty(realty);
	}
	
	public void getAllByProvince2(String province) {

		getAll().stream().filter(realty -> realty.getProvince().equals("İstanbul"))
		.filter(realty -> realty.getProvince().equals("İzmir"))
		.filter(realty -> realty.getProvince().equals("Ankara"))
			.count();

	}
	

}
