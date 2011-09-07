package com.sample.VideoStore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ActorController {

	@RequestMapping(value="/actor")
	public String myRandomFunction(){
		System.out.println("ActorController: Passing through...");
		return "actor";
	}

}
