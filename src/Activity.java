import java.io.Serializable;

/**
 * Created by Radu on 3/25/16.
 */
public class Activity implements Serializable {
    private String name;
    private String startDate;
    private String endDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString(){
        return String.format("Activity name: %s, Start Date: %s, End Date: %s", name, startDate, endDate);
    }

    public Activity(){
    }

    public Activity(String name, String startDate, String endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
