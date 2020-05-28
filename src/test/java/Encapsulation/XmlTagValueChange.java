package Encapsulation;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class XmlTagValueChange {
	
	public void uploadResponseXMLFileswithCorrelationID(String reportsubtype, String lotid, String filepath, String Status)throws InterruptedException, HeadlessException, IOException,
	AWTException			 {
String FilePath = filepath;
try{
	//// Reading given XML File
	File xmlFile = new File(FilePath);
	Reader fileReader = new FileReader(xmlFile);
	BufferedReader bufReader = new BufferedReader(fileReader);
	StringBuilder sb = new StringBuilder();;
	String line = bufReader.readLine();
	// Updating Correlation Id and Latest TimeStamp in the Upload able XML files
	while (line != null) {
		if (line.contains("CorrelationID")) {
			line = "					<CorrelationID xmlns=\"http://EMVS.EU/Common/20131/\">" + "TEST" + "</CorrelationID>";
		} else if (line.contains("Timestamp")) {
			line=  "					<Timestamp xmlns=\"http://EMVS.EU/Common/20131/\">" + java.time.LocalDate.now() +"T"+ java.time.LocalTime.now()  + "Z</Timestamp>";
		}
		sb.append(line).append("\n");
		line = bufReader.readLine();
		
	}
	
	// Writing to the XML File....
	File xmloutfile = new File(FilePath);
	BufferedWriter filewriter = null;
	try {
	    filewriter = new BufferedWriter(new FileWriter(xmloutfile));
	    filewriter.write(sb.toString());
	} finally {
	    if (filewriter != null) filewriter.close();
	}
	Thread.sleep(500);
}catch (Exception e) {
	System.out.println("Exception in TC008007_Response File Update with CorrelationId ::" + e);
}
Thread.sleep(500);


}
public static void main(String args[]) throws HeadlessException, InterruptedException, IOException, AWTException
{
	String reportsubtype="One";
	String lotid ="LOTJS101";
	String filepath="C:\\Users\\user\\Desktop\\TestAutomationXML\\ReadFile.xml";
	String Status="Good";
	XmlTagValueChange obj=new  XmlTagValueChange();
	obj.uploadResponseXMLFileswithCorrelationID(reportsubtype, lotid, filepath, Status);
}
}
