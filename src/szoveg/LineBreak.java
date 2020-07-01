package szoveg;

public class LineBreak {
    public int lineLenght;

    public LineBreak(int i) {
        lineLenght = i;
    }

    public String textBreak(String text){
        String[] lines = textLine(text.trim());
        int linesNumber = lines.length;
        String textBreak = lines[0];

        for (int i = 1; i < linesNumber; i++){
            textBreak += "\n" +lineBreak(lines[i]);
        }

        return textBreak;
    }

    public String[] textLine(String text){
        String[] lines = text.split("\n");

        return lines;
    }

    public String longWordBreak(String longWord){

        int wordLength = longWord.length();

        if(wordLength < lineLenght*2)
            return longWord.substring(0,lineLenght) + "\n" + longWord.substring(lineLenght);
        else if (wordLength < lineLenght*3)
            return longWord.substring(0,lineLenght) + "\n" + longWord.substring(lineLenght,lineLenght*2) + "\n" + longWord.substring(lineLenght*2);

        return "";
    }

    public int restCharNumber(String longWord){
        return longWord.length()%lineLenght;
    }

    public String lineBreak(String line){
        String[] words = line.split(" ");

        String lineBreak;
        int lineCharLength;

        if (words[0].length() > lineLenght){
            lineBreak = longWordBreak(words[0]);
            lineCharLength = restCharNumber(words[0]);
        }else{
            lineBreak = words[0];
            lineCharLength = words[0].length();
        }

        for (int i = 1; i < words.length; i++){
            lineCharLength += words[i].length() + 1;
            if (lineLenght >= lineCharLength){
                lineBreak += " " + words[i];
            }else{
                lineBreak += "\n";
                if (lineLenght > words[i].length()){
                    lineBreak += words[i];
                    lineCharLength = words[i].length();
                }else {
                    lineBreak += longWordBreak(words[i]);
                    lineCharLength = restCharNumber(words[i]);
                }
            }
        }

        return lineBreak;
    }

}
