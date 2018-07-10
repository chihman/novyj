import java.io.*;

/**
 * Created by pro-28 on 10.07.2018.
 */
public class task6882 {
    public static void  main(String[] args) {

        try{
            FileInputStream fstream = new FileInputStream("C:\\Users\\pro-28\\Desktop\\novyj\\src\\task6882\\test6.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            int a =0;
            int n =0;
            while ((strLine = br.readLine()) != null){
                if (a>Integer.valueOf(strLine)){
                    a=Integer.valueOf(strLine);
                    n++;
                }
            }
            if (n==0){
                System.out.println("Файл пуст");
                return;
            }
            System.out.println(a);
        }catch (IOException e){
            System.out.println("ошибка ");
        }
        catch (NumberFormatException e2){
            System.out.println("Не удается считать число");
        }
}}
