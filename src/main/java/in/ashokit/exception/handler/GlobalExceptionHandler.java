package in.ashokit.exception.handler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import in.ashokit.customeException.BookNotFoundException;

@Controller
@ControllerAdvice
public class GlobalExceptionHandler 
{
	@ExceptionHandler(value=BookNotFoundException.class)
	public String handleException()
	{
		return "error";
	}

}
