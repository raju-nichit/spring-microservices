package com.programmingkida.microservices.netflixzuulapigetwayserever;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class ZuulLogginFilter extends ZuulFilter {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Override
	public Object run() {
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		LOGGER.info("=========================================================================");
		LOGGER.info(" Request URI    :{}", request.getRequestURI());
		LOGGER.info(" RequestMethod  :{} ", request.getMethod());
		LOGGER.info(" Content-Type   :{} ", request.getContentType());
		try {
			if (!request.getMethod().equalsIgnoreCase("get"))
				LOGGER.info(" Request body  :\n{} ", IOUtils.toString(request.getReader()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		LOGGER.info("=========================================================================");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
