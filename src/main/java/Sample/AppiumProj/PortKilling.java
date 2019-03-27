package Sample.AppiumProj;

import java.io.IOException;
import java.io.InputStream;

public class PortKilling {
public void kill() throws IOException, InterruptedException{
	String command="";
	ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/C", "netstat -n -o | findstr :8161");
    Process process = builder.start();
    process.waitFor();
    printProcessStream(process.getInputStream());
    }
public void port() throws IOException{
	Runtime.getRuntime().exec(new String[] {"cmd", "/K", "taskkill /IM kubectl.exe /F"});
}

    private void printProcessStream(InputStream inputStream) throws IOException
    {
    int bytesRead = -1;
    byte[] bytes = new byte[1024];
    String output = "";
    while((bytesRead = inputStream.read(bytes)) > -1){
        output = output + new String(bytes, 0, bytesRead);
    }
    System.out.println(" The netstat command response is \r\n"+output);
    
    
    }
	
	public static void main(String[] args) throws IOException, InterruptedException {
		PortKilling ll = new PortKilling();
		ll.port();
	}

}
