import java.util.ArrayList;

public class MessageCreator 
{
	public ArrayList<String> messages;
	
	public MessageCreator()
	{
		this.messages = new ArrayList<String>();
		for(int i = 0; i < 10; i++)
		{
			
		}
	}
	
	
	
	public String generateHeader()
	{
		String message = String.valueOf(Math.floor(Math.random()*5) + 1);
		message += String.valueOf(Math.floor(Math.random()*5) + 1);
		return null;
	}
	
	public String generateData()
	{
		return null;
				
	}
	
}
