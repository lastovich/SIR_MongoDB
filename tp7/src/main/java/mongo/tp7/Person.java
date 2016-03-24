package mongo.tp7;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity
public class Person {
	private String name;
	@Id
	private ObjectId id;
	//Ta
	@Embedded
	private List<Address> addresses = new ArrayList<Address>();

	public String getName() {
		return name;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}


	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Address address) {
		this.addresses.add(address);
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
