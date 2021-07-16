package POJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeletePlacePOJO_RESPONSE {
public String status;

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}
}
