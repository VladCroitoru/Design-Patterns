package factory.abstr;

public class BirdsFactory extends AnimalFactory{

	@Override
	public Animal create(String animal) {
		
		animal = animal.toUpperCase();

		if(animal.equals("OWL")){
			return new factory.abstr.Owl();
		}
		return null;
	}

}
