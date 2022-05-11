package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/api")
public class Rest {

	private Log logger = LogFactory.getLog(this.getClass());
	
	@GetMapping("/ciao")
	public @ResponseBody String getCiao() {
		logger.debug("inizio getCiao");
		return "ciao home responce";
	}
}
 