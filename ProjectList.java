import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import java.util.ArrayList;

public class ProjectList {
	// A list of Projects.
	private ArrayList<Project> projects;

	// Constructs a new empty ProjectList.
	public ProjectList() {
		this.projects = new ArrayList<Project>();
	}
	
	// Returns the list of projects.
	public ArrayList<Project> getProjects() {
		return this.projects;
	}

	// Adds a new project into the list.
	public void add(Project p) {
		this.projects.add(p);	
	}

	// Writes the projects to a file.
	public void save(String filepath) {
		try {
			FileOutputStream fileOut = new FileOutputStream(filepath);
			PrintWriter writer = new PrintWriter(fileOut);

			// Loop through each project in our list, and write
			// each one to the file.
			for (int i = 0; i < this.projects.size(); i++) {
				writer.println(this.projects.get(i));
			}
			writer.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
