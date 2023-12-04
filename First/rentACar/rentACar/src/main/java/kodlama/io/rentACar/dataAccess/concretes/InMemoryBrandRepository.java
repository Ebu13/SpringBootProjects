package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;


@Repository
public class InMemoryBrandRepository implements BrandRepository{
	
	private List<Brand> brands;
	
		
	public InMemoryBrandRepository() {
		brands=new ArrayList<Brand>();
		brands.add(new Brand(1,"Volvo"));
		brands.add(new Brand(2,"BMW"));
		brands.add(new Brand(3,"Mercedes"));
		brands.add(new Brand(4,"Peugeot"));
		brands.add(new Brand(5,"Audi"));
		brands.add(new Brand(6,"TOGG"));
	}


	@Override
	public List<Brand> getAll() {
		
		return brands;
	}
	
}
