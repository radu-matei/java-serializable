import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Radu on 3/25/16.
 */
public class Project implements Serializable {
    private String title;
    private ArrayList<Activity> activities;
    private Person manager;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getManager() {
        return manager;
    }

    public void setManager(Person manager) {
        this.manager = manager;
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public void addActivity(String name, String startDate, String endDate){
        activities.add(new Activity(name,startDate, endDate));
    }

    @Override
    public String toString(){
        String information = String.format("Title: %s\nManager: %s \n", title, manager.toString());

        String stringActivities = "Activities\n";
        for (Activity activity: activities) {
            stringActivities += activity.toString() + "\n";
        }

        return information + stringActivities;
    }



    public Project(){
        activities = new ArrayList<Activity>();
    }

    public Project(String title, Person manager){
        activities = new ArrayList<Activity>();
        this.title = title;
        setManager(manager);
    }
}
