package kon.br.tonkey;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] lines = new String[] {"lol ", "odeio ", "\nquem leu ", "é ", "lendario "};
        String path = "c:\\temp\\out1.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }

//        String path = "c:\\temp\\in1.txt";
//        FileReader fr = null;
//        BufferedReader br = null;
//
//        try {
//            fr = new FileReader(path);
//            br = new BufferedReader(fr);
//
//            String line = br.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = br.readLine();
//            }
//        }
//
//        catch (FileNotFoundException e) {
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        finally {
//
//            try {
//                if (br != null) {
//                    br.close();
//                }
//
//                if (fr != null) {
//                    fr.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


//        System.out.print("Write the file name: ");
//        String name = sc.nextLine();
//
//        System.out.println();
//        System.out.println("Choose a file type: ");
//        System.out.println("""
//                1 | txt
//                2 | html
//                3 | json
//                4 | other...
//                """);
//        int type = sc.nextInt();
//        String typeChoose = "";
//
//        if (type == 1) {
//            typeChoose = "txt";
//        }
//        else if (type == 2) {
//            typeChoose = "html";
//        }
//        else if (type == 3) {
//            typeChoose = "json";
//        }
//        else if (type == 4) {
//            sc.nextLine();
//            typeChoose = sc.nextLine();
//        }
//
//
//        File file = new File("c:\\temp\\" + name + "." + typeChoose);
//
//        if (!file.exists()) {
//            try {
//                file.createNewFile();
//            }
//            catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//
        sc.close();
    }
}