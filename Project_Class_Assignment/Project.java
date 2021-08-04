public class Project{
    private String name;
    private String description;
    public Project() {
        this("myProject", "This is default Project");
    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String elevatorPitch(){
        return getProjectFromDescription();
    }
    public void setNameOfProject(String name){
        this.name = name;
    }
    public String getProjectFromName(){
        return this.name;
    }
    public void setNameOfProject(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getProjectFromDescription(){
        return "name" + this.name + "description" + this.description;
    }
}
