package in.ashokit.serviceComponent;

import org.springframework.stereotype.Service;

import in.ashokit.customeException.BookNotFoundException;
@Service
public class BookServiceImp implements BookService
{

	@Override
	public Double findPrize(String id)
	{
		if(id.equals("B101"))
		{
			return 400.00;
		}
		else
		{
			throw new BookNotFoundException("No Book found Sorry");
			
		}
		
	}
	

}
