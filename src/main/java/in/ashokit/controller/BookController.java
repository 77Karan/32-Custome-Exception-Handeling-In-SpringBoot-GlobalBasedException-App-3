package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.serviceComponent.BookServiceImp;

@Controller
public class BookController 
{
	@Autowired
	private BookServiceImp imp;
	@GetMapping("/getbookprize") 
	public String getBookPrize(@RequestParam("bookId") String bookId,Model model)
	{
		Double bookPrize = imp.findPrize(bookId);
		model.addAttribute("prizeKey",bookPrize);
		return "index";
	}

	
}
