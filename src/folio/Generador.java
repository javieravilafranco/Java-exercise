package folio;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Random;

public class Generador {
    
       final String caracteres = "ABCDEF0123456789";
       private static String a = "";
       private static String b = "";
       private static String c = "";
       private static int index=6,lastIndex=6;
       
    public static void main(String[] args) throws FileNotFoundException {     
        
        Generador obj= new Generador();
        obj.folio(true);
        
    }
    
    public void folio(boolean flag){
                
        if(flag==false){
            
            for (int i=0; i<6; i++){
            
                do{
                index=(int)(Math.random()*caracteres.length());
                }while(index<6 && lastIndex<6);
                a += caracteres.charAt(index);
                lastIndex=index;
                }
        
        for (int i=0; i<8; i++){
            do{
            index=(int)(Math.random()*caracteres.length());
            }while(index<6 && lastIndex<6);
            b += caracteres.charAt(index);
            lastIndex=index;
            }
        
        for (int i=0; i<7; i++){
            do{
            index=(int)(Math.random()*caracteres.length());
            }while(index<6 && lastIndex<6);
            c += caracteres.charAt(index);
            lastIndex=index;
            }
        String Folio = a + "-" + b + "-" + c;
            
        try{
	  FileWriter fstream = new FileWriter("log.txt",true);
	  BufferedWriter out = new BufferedWriter(fstream);
	  out.write( a + "-" + b + "-" + c + "\r\n");
	  out.close();
            }catch (Exception e){
                System.err.println("Error while writing to file: " +
                e.getMessage());
            }
        
            System.out.println("Folio: \n" + Folio);
            
        }else{
            
            Random rn = new Random();
                
            int prefijo = rn.nextInt(32)+1; 
        
            switch(prefijo){
                case 1:
                    a = "AGU";
                    break;
                case 2:
                    a = "BCN";
                    break;
                case 3:
                    a = "BCS";
                    break;
                case 4:
                    a="CAM";
                    break;
                case 5:
                    a="CHP";
                    break;
                case 6:
                    a="CHH";
                    break;
                case 7:
                    a="CMX";
                    break;
                case 8:
                    a="COA";
                    break;
                case 9:
                    a="COL";
                    break;
                case 10:
                    a="DUR";
                    break;
                case 11:
                    a="GUA";
                    break;
                case 12:
                    a="GRO";
                    break;
                case 13:
                    a="HID";
                    break;
                case 14:
                    a="JAL";
                    break;
                case 15:
                    a="MEX";
                    break;
                case 16:
                    a="MIC";
                    break;
                case 17:
                    a="MOR";
                    break;
                case 18:
                    a="NAY";
                    break;
                case 19:
                    a="NLE";
                    break;
                case 20:
                    a="OAX";
                    break;
                case 21:
                    a="PUE";
                    break;
                case 22:
                    a="QUE";
                    break;
                case 23:
                    a="ROO";
                    break;
                case 24:
                    a="SLP";
                    break;
                case 25:
                    a="SIN";
                    break;
                case 26:
                    a="SON";
                    break;
                case 27:
                    a="TAB";
                    break;
                case 28:
                    a="TAM";
                    break;
                case 29:
                    a="TLA";
                    break;
                case 30:
                    a="VER";
                    break;
                case 31:
                    a="YUC";
                    break;
                case 32:
                    a="ZAC";
                    break;
                }
            
            for (int i=0; i<6; i++){
            
                do{
                index=(int)(Math.random()*caracteres.length());
                
                }while(index<6 && lastIndex<6);
                a += caracteres.charAt(index);
                lastIndex=index;
                }
        
        for (int i=0; i<8; i++){
            do{
            index=(int)(Math.random()*caracteres.length());
            }while(index<6 && lastIndex<6);
            b += caracteres.charAt(index);
            lastIndex=index;
        
            }
        
        for (int i=0; i<7; i++){
            do{
            index=(int)(Math.random()*caracteres.length());
            }while(index<6 && lastIndex<6);
            c += caracteres.charAt(index);
            lastIndex=index;
        
            }
        String Folio = a + "-" + b + "-" + c;
            
        try{
	  FileWriter fstream = new FileWriter("log.txt",true);
	  BufferedWriter out = new BufferedWriter(fstream);
	  out.write("Folio: " + a + "-" + b + "-" + c + "\r\n");
	  out.close();
            }catch (Exception e){
                System.err.println("Error while writing to file: " +
                e.getMessage());
            }
        
            System.out.println("Folio: \n" + Folio);
        }  
    }
}

