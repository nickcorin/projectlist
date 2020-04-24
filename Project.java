public class Project {
	private static final long serialVersionUID = 1L;	

	// Name of the project.
	private String name;

	// Description of the project.
	private String description;

	// Constructs a new Project object with the given name and description.
	public Project(String n, String d) {
		this.name = n;
		this.description = d;
	}

	// Returns the name of the project.
	public String getName() {
		return this.name;
	}

	// Returns the description of the project.
	public String getDescription() {
		return this.description;
	}
	
	// Sets the name of the project. 
	public void setName(String n) {
		this.name = n;
	}

	// Sets the description of the project.
	public void setDescription(String d) {
		this.description = d;
	}

	// Returns a string representation of a Project.
	public String toString() {
		String output = "Name: " + this.name + "\n";
		output += "Description: " + this.description + "\n";

		return output;
	}
}
