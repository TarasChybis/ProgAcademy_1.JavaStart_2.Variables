package home_work_9_2_OOP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class GroupFileStorage {

//	public void saveGroupToCSV(Group gr) {
//		File text = new File(gr.getGroupName() + ".csv");
//		List<Student> a = gr.getList();
//		String b = "";
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] != null) {
//				b = b + a[i].getName() + " " + a[i].getLastName() + " " + a[i].getGender() + " " + a[i].getId() + " "
//						+ a[i].getGroupName() + System.lineSeparator();
//			}
//			try (PrintWriter pw = new PrintWriter(text)) {
//
//				pw.println(b);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}

//	public Group loadGroupFromCSV(File file) {
//		Group g = new Group(file.getName().substring(0, file.getName().indexOf(".")), null);
//		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//			for (int i = 0; i < g.getStudens().length; i++) {
//				String st = reader.readLine();
//				if (st != null) {
//					g.getStudens()[i] = new Student(st, st, i).fromCSVtoStudent(st);
//				}
//			}
//		} catch (IOException e) {
//		}
//		return g;
//	}
	
	public File findFileByGroupName(String groupName, File workFolder) {

		File[] x = workFolder.listFiles();
		if (x != null) {
			for (int i = 0; i < x.length; i++) {
				if (x[i].isFile() && x[i].getName().equals(groupName + ".csv")) {
					return x[i];
				}
			}
		}
		return null;
	}
}
