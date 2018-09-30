package QAClass;

import java.io.File;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {

        Random r = new Random();
        int Low = 1;
        int High = 20;
        int strSize = r.nextInt(High-Low) + Low;


        String symbols = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strSize; i++) {
            sb.append(symbols.charAt(random.nextInt(symbols.length()-1)));
        }

        File mainDir = new File(sb.toString());
        try{
            if(mainDir.mkdir()) {
                System.out.println("Directory Created");
            } else {
                System.out.println("Directory is not created");
            }
        } catch(Exception e){
            e.printStackTrace();
        }

        File newFile = new File(mainDir.getAbsolutePath() + File.separator + "new_file.txt");
        try{
            if(newFile.createNewFile()) {
                System.out.println("new_file.txt Created");
            } else {
                System.out.println("new_file.txt is not created");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
