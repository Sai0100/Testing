package org.hack.Testing.main.controller;

import java.util.List;

import org.hack.Testing.main.model.Journey;
import org.hack.Testing.main.model.Request;
import org.hack.Testing.main.model.User;
import org.hack.Testing.main.service.SurpriseManager;
import org.hack.Testing.main.service.SurpriseManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("surprise/")
public class SurpriseController implements SurpriseManager {

	@Autowired
	private SurpriseManagerImpl surpriseManagerImpl;

	@Override
	@RequestMapping(value = "getHelperList/{from}/{to}", method = RequestMethod.GET)
	public List<Journey> getHelperList(@PathVariable("from") String from, @PathVariable("to") String to) {
		return surpriseManagerImpl.getTravellers(from, to);
	}

	@Override
	public List<User> getSenderList() {
		return null;
	}

	@Override
	public boolean addGift() {
		return false;
	}

	@Override
	@RequestMapping(value = "getGiftList", method = RequestMethod.GET)
		public List<Request> getGiftRequests() {
		return surpriseManagerImpl.getGiftRequests();
	}

	@Override
	@RequestMapping(value = "getFrom/{from}", method = RequestMethod.GET)
	public List<Journey> getJourneyFrom(@PathVariable("from") String from) {
		return surpriseManagerImpl.getJourneyFrom(from);
	}

	@Override
	@RequestMapping(value = "getTo/{to}", method = RequestMethod.GET)
	public List<Journey> getJourneyTo(@PathVariable("to") String to) {
		return surpriseManagerImpl.getJourneyTo(to);
	}

	@Override
	@RequestMapping(value = "save/journey", method = RequestMethod.POST)
	public boolean addJourneyDetails(@RequestBody Journey journey) {
		return surpriseManagerImpl.addJourneyDetails(journey);
	}

}
