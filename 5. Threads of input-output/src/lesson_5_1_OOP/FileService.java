package lesson_5_1_OOP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileService {

	public static void copyFile(File in, File out) throws IOException {
		try(InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {
			
			is.transferTo(os);
			
		} catch (IOException e) {
//			your code
			throw e;
		}
	}
}
