package org.hack.Testing.main.service;

import java.util.List;

import org.hack.Testing.main.model.Request;
import org.hack.Testing.main.model.User;

public interface ServiceManager {

	List<User> getHelperList();

	List<User> getSenderList();

	boolean addGift();

	List<Request> getGiftRequests();

}
