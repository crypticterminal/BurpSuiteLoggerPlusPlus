package burp.filter;

import java.awt.*;

/**
 * Created by corey on 19/07/17.
 */
public class ColorFilter {
    private String name;
    private Filter filter;
    private String filterString;
    private Color backgroundColor;
    private Color foregroundColor;
    private boolean enabled;

    public ColorFilter(){
        this.enabled = true;
    }

    public ColorFilter(String name, Filter filter, Color backgroundColor){
        this.name = name;
        this.filter = filter;
        this.backgroundColor = backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor){
        this.backgroundColor = backgroundColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public Color getForegroundColor() {return foregroundColor;}

    public void setForegroundColor(Color foregroundColor) {this.foregroundColor = foregroundColor;}

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getFilterString() {
        return filterString;
    }

    public void setFilterString(String filterString) {
        this.filterString = filterString;
    }
}
