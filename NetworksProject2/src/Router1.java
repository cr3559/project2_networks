import java.io.IOException;
import java.net.ServerSocket;

public class Router1 
{
	ServerSocket serverSocket;
	
    public void setupServer() throws InterruptedException
    {    	  
        try
        {
            
            serverSocket = new ServerSocket(4446); 	// 4446 is the port number the server will listen to
						   							// only one application can listen to a port at a time
        }
        catch (IOException e)
        {
            
            e.printStackTrace();
        }

        try
        {

        	//Socket contains all of the info about the connection
        	while(true)
        	{
        		// Have the server listen and accept if someone tries to connect.
        		//Blocking call - it will sit and wait here until a Client tries to connect.
        		//Creates a new thread for each socket accept
        		Thread thread =  new Thread(new RequestHandler(serverSocket.accept(), "router_1_table.txt"));
        		//Thread.sleep(1000);
        		synchronized(this)
        		{
        			thread.start();
        		}
            
        	}
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
	public static void main(String[] args) throws InterruptedException 
	{
		Router1 server = new Router1();
		server.setupServer();
		


	}


}
