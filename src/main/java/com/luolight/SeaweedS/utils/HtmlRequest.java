package com.luolight.SeaweedS.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Random;
 
public class HtmlRequest {
	
	private static String htmlRequestPro = ProperU.read(Constans.PROSOURCE, "htmlRequest");
	
	public static String filePre = ProperU.read(htmlRequestPro, "filePre");
	
	public static String seaweedSister = ProperU.read(htmlRequestPro, "seaweedSister");
	
    public static String getStringRandom(int length) {  
          
        String val = "";  
        Random random = new Random();  
          
        for(int i = 0; i < length; i++) {  
              
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";  
            if( "char".equalsIgnoreCase(charOrNum) ) {  
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;  
                val += (char)(random.nextInt(26) + temp);  
            } else if( "num".equalsIgnoreCase(charOrNum) ) {  
                val += String.valueOf(random.nextInt(10));  
            }  
        }  
        return val;  
    } 
    
    /**
     * 通过url生成html
     * @param htmlUrl url
     * @param fileName html文件名称
     * @param seaweedSister 生成辅助文件
     * @throws IOException
     */
    public static void htmlGet(String htmlUrl, String fileName, String seaweedSister) throws IOException{
    	URL url = new URL(htmlUrl);
    	try {
            InputStream is = url.openStream();
            InputStreamReader isr = new InputStreamReader(is,"utf-8");

            BufferedReader br = new BufferedReader(isr);
            String data = "";

            File file = new File(fileName);
            if(!file.exists()) file.createNewFile();
            FileOutputStream outPut = new FileOutputStream(file);
            
            while ((data = br.readLine()) != null){
            	data = data.trim();
            	if(data.equals("")) continue;
            	if(data.equals("</body>")) {
            		InputStream is_seaweed_sister = new FileInputStream(new File(seaweedSister));
                    InputStreamReader isr_seaweed_sister = new InputStreamReader(is_seaweed_sister,"utf-8");
            		BufferedReader br_seaweed_sister = new BufferedReader(isr_seaweed_sister);
                    String data_seaweed_sister = "";
            		while ((data_seaweed_sister = br_seaweed_sister.readLine()) != null){
            			data_seaweed_sister += "\t\n";
                        outPut.write(data_seaweed_sister.getBytes("utf-8"));
                    }
            		br_seaweed_sister.close();
            		isr_seaweed_sister.close();
            		is_seaweed_sister.close();
            	}
            	data += "\t\n";
                outPut.write(data.getBytes("utf-8"));
            }
            outPut.close();
            br.close();
            isr.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws IOException {
        String fileName = HtmlRequest.filePre + HtmlRequest.getStringRandom(12) + ".html";
    	htmlGet("https://opendocs.alipay.com/apis/api_1", fileName, HtmlRequest.seaweedSister);
	}
}
