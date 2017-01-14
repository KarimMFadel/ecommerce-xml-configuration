package com.tornado.ecommerce.controller.base;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.messaging.support.ErrorMessage;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.tornado.ecommerce.common.dto.EcommerceResponce;
import com.tornado.ecommerce.common.exception.EcommerceException;

@ControllerAdvice
public class GlobalControllerAdvice {
	
	final static Logger logger = Logger.getLogger(GlobalControllerAdvice.class);

	@ExceptionHandler
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    @ResponseBody
    ErrorMessage handleException(Exception ex) {
		logger.error("@ControllerAdvice : General Exception");
    	return new ErrorMessage(ex);
    } 
	
    @ExceptionHandler
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    ErrorMessage handleException(AccessDeniedException ex) {
    	logger.error("@ControllerAdvice : AccessDeniedException");
    	return new ErrorMessage(ex);
    } 
    
//    @Autowired
//    private MessageSource messageSource;
     
    @ExceptionHandler(EcommerceException.class)
    @ResponseStatus(value=HttpStatus.BAD_REQUEST)
    @ResponseBody 
    EcommerceResponce handleEcommerceException(HttpServletRequest req, EcommerceException ex) {
       /* Locale locale = LocaleContextHolder.getLocale();
        String errorMessage = "";//messageSource.getMessage("error.no.smartphone.id", null, locale);
        errorMessage += ex.getMessage();
        String errorURL = req.getRequestURL().toString();*/
       
        return EcommerceResponce.failureResponce(ex.getMessage()+" "+req.getRequestURL().toString());
    }
}
