package POJO;

public class DeletePlacePOJOREQUEST {
String place_id;
public DeletePlacePOJOREQUEST(String placeid) {
	this.place_id=placeid;
}

public String getPlace_id() {
	return place_id;
}

public void setPlace_id(String place_id) {
	this.place_id = place_id;
}
}
