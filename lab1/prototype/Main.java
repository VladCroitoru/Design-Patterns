package prototype.abstr;

public class Main {

	public static void main(String[] args) {
		
		// load objects
		ProductFactory.loadCache();
		
		// clone existing album object
		Album album = (Album) ProductFactory.getProduct("Album");
		System.out.println(album.hashCode());


		Album album1 = (Album) ProductFactory.getProduct("Album");
		System.out.println(album1.hashCode());

		// clone existing book object
		Book book = (Book) ProductFactory.getProduct("Book");
		System.out.println(book);
		
		// clone existing movie object
		Movie movie = (Movie) ProductFactory.getProduct("Movie");
		System.out.println(movie);



	}

}

