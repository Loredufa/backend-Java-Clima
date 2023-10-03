package com.ideas.springboot.web.app.service.dto;
import lombok.Data;


@Data
public class TeamResponse {

	 private LocationDTO location;
	 private CurrentDTO current;

	 
	    public TeamResponse() {
	        // Constructor sin argumentos requerido por Jackson
	    }

	    public LocationDTO getLocation() {
	        return location;
	    }

	    public void setLocation(LocationDTO location) {
	        this.location = location;
	    }

	    public CurrentDTO getCurrent() {
	        return current;
	    }

	    public void setCurrent(CurrentDTO current) {
	        this.current = current;
	    }
}