package ArmLang;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileContent = Files.readString(Path.of("/home/aram/IdeaProjects/Learn1/src/ArmLang/first_program.arl"));
        String[] byLinesStr = fileContent.split(":");
        for (int i = 0; i < byLinesStr[i].length(); ++i) {
             System.out.println(byLinesStr[i]);
//           String[] str2 = fileContent.split("\\s+");
        }
    }
}

