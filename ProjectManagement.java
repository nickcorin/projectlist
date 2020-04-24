public class ProjectManagement {
	static String filepath = "./projects.txt";

	public static void main(String []args) {
		ProjectList projects = new ProjectList();

		Project project1 = new Project("project1", "first project");
		Project project2 = new Project("project2", "second project");
		Project project3 = new Project("project3", "third project");

		projects.add(project1);
		projects.add(project2);
		projects.add(project3);

		projects.save(filepath);
	}		
}

