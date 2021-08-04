public class TestProject{
    public static void main(String[] args){
        Project coolProject = new Project();
        coolProject.setNameOfProject("Project1");
        String firstProject = coolProject.getProjectFromName();
        coolProject.setNameOfProject("Project2", "Description Given");
        String fullProject = coolProject.getProjectFromDescription();
        String pitch = coolProject.elevatorPitch();
        System.out.println(firstProject);
        System.out.println(fullProject);
        System.out.println(pitch);
    }
}