import java.io.*;

public class var12 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        BufferedWriter bw=null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\Users\\Наталья\\IdeaProjects\\lab6\\src\\in.txt"),"utf-8"));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("C:\\Users\\Наталья\\IdeaProjects\\lab6\\src\\out.txt"),"utf-8"));

            String[] words;
            /*while((line = br.readLine()) != null){
                words = line.split(" ");
                String maxWord="a";
                    for(int i = 0; i < words.length; i++){
                        if(words[i].length()>maxWord.length()){
                            maxWord=words[i];
                        }
                    }
                    System.out.println(maxWord);
            }*/
            int lineCount=0;
            String maxWord = br.readLine();
            String minWord = maxWord;
            String s;
            while ((s = br.readLine()) != null) {
                words = s.split(" ");
                for(int i = 0; i < words.length; i++){
                    if(words[i].length()>maxWord.length()){
                        maxWord=words[i];
                    }
                    if(words[i].length()<minWord.length()){
                        maxWord=words[i];
                    }
                }
            }
            System.out.println(minWord+" "+maxWord);
            bw.write(minWord+" "+maxWord);

        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        }
        finally{
            br.close();
            bw.flush();
            bw.close();
        }
    }
}