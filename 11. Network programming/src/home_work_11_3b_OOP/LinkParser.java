package home_work_11_3b_OOP;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class LinkParser {

	public static void getLinksFromWebsite(String link) throws IOException {
        String linkStart = "<a href=\"";
        Path fileForLinks = Paths.get("links.txt");
        URL url = new URL(link);
        try (Scanner scanner = new Scanner(url.openStream())) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();

                if (line.contains(linkStart)) {

                    int from = line.indexOf(linkStart) + linkStart.length();
                    int to = line.indexOf("\"", from);
                    line = line.substring(from, to) + System.lineSeparator();

                    if (Files.notExists(fileForLinks)) {
                        Files.createFile(fileForLinks);
                    }
                    if (!line.startsWith("#")) {
                        Files.writeString(fileForLinks, line, StandardOpenOption.APPEND);
                    }
                }
            }

        }
    }
	
}
