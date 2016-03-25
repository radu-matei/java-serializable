import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Person newton = new Person("Isaac", "Newton");

        Project p = new Project("Physics Project", newton);

        p.addActivity("Classical Mechanics", "January 1 1660", "January 1 1666");
        p.addActivity(new Activity("Comet sighting", "January 2 1666", "January 3 1666"));
        p.addActivity("Integral calculus", "January 4 1666", "October 30 1701");

        try {
            FileManager.saveObject(p, "project.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Project loadedProject = null;

        try {
            loadedProject = (Project)FileManager.loadObject("project.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(loadedProject.toString());

        loadedProject.setTitle("Math");

        try {
            FileManager.saveObject(loadedProject, "project.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
