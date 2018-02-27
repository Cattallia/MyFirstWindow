package org.itstep;

import java.io.FileWriter;
import java.io.IOException;

public class AccountSaver {
	
	private static final String FILE_PATH = "B:\\test\\accountList.csv";
	
	public static void writeTextToFile(String text) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(FILE_PATH, true); //дополнит инфо файла
			writer.write(text);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}
}