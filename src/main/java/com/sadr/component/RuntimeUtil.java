/**
 * 
 */
package com.sadr.component;

import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author silvio.cantillo
 *
 */
public class RuntimeUtil implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {
	private static int port;

	@Override
	public void onApplicationEvent(EmbeddedServletContainerInitializedEvent event) {
		port = event.getEmbeddedServletContainer().getPort();
	}

	public static int getPort() {
		return port;
	}
}
