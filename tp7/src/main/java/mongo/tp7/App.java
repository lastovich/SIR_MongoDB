package mongo.tp7;

import java.net.UnknownHostException;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

/**
 * Let's do some mongo!
 *
 */
public class App 
{
	public static void main( String[] args ) throws UnknownHostException
	{
		Morphia morphia = new Morphia();	
		Mongo mongo = new Mongo();
		morphia.map(Person.class).map(Address.class);
		Datastore ds = morphia.createDatastore(mongo, "my_database");
		
		//Creation of Tintin
		
		Person p = new Person();
		p.setName("Tintin");
		Address address = new Address();
		address.setStreet("123 Some street");
		address.setCity("Some city");
		address.setPostCode("123 456");
		address.setCountry("Some country");
		//set address
		p.setAddresses(address);
		
		//Creation of Nya
		
		Person p1 = new Person();
		p1.setName("Nya");
		Address address1 = new Address();
		address1.setStreet("1 Street");
		address1.setCity("1 City");
		address1.setPostCode("1111 000");
		address1.setCountry("First Country");
		//set address
		p1.setAddresses(address1);
		
		//Creation of Lilin
		
		Person p2 = new Person();
		p2.setName("Lilin");
		Address address2 = new Address();
		address2.setStreet("Nowhere Street");
		address2.setCity("Perfect City");
		address2.setPostCode("9999 6666");
		address2.setCountry("Tired Country");
		//set address
		p2.setAddresses(address2);
			
		
		// Save the POJO
		ds.save(p);
		ds.save(p1);
		ds.save(p2);
		for (Person e : ds.find(Person.class)){
			System.err.println("!!!!!!!!!!!!!!!!");
			System.err.println(e);
			System.err.println("Name: " + e.getName());
			System.err.println(e.getAddresses());
		}

	}

}
