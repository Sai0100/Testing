package org.hack.Testing.main.config;

import java.util.List;

import org.hack.Testing.main.model.Journey;
import org.hack.Testing.main.model.Request;
import org.hack.Testing.main.util.DataInit;
import org.springframework.stereotype.Component;

@Component
public class SurpriseRepo {

	private DataInit init = new DataInit();

	public List<Journey> findAll() {
		return init.getJourneyData();
	}

	public boolean save(Journey journey) {
		return init.add(journey);
	}

	public List<Journey> getTravellers(String from, String to) {
		return init.getTravellers(from, to);
	}

	public List<Request> getGiftRequests() {
		return init.getGiftRequests();
	}

}
