/**
 * 
 */
package com.sadr.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sadr.model.PingRequest;
import com.sadr.model.PingResponse;

/**
 * @author silvio.cantillo
 *
 */

@RestController
@RequestMapping("/sadr")
public class SadrController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	Environment environment;

	@RequestMapping(method = RequestMethod.POST, value = "/ping")
	public PingResponse ping(HttpServletRequest request,
			@RequestBody(required = true) PingRequest pingRequest) {

		logger.debug("--> ping received - id: {} - message: {}", pingRequest.getId(), pingRequest.getMessage());
		return new PingResponse("Hello from Sadr on port: " + environment.getProperty("local.server.port"));
	}
}
