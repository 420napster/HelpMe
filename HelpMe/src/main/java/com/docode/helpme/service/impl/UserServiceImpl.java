package com.docode.helpme.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docode.helpme.model.User;
import com.docode.helpme.repository.UserRepository;
import com.docode.helpme.service.UserService;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;
	
	@Override
	public void saveUser(User user) {
		userRepo.save(user);
	}

	@Override
	public void callForHelp(String number) {
		final String ACCOUNT_SID = "";
		final String AUTH_TOKEN = "";

		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		
		//User user = userRepo.findByMobileNumber(number);

		Message message = Message.creator(new PhoneNumber("+919650649025"), // to
				new PhoneNumber("+12018317304"), // from
				"Where's Wallace?").create();

		System.out.println(message.getSid());
	}
	
}
