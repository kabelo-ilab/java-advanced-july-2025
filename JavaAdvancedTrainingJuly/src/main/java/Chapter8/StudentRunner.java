package Chapter8;


public class StudentRunner {
    public static void main(String[] args) {

        try{
            Student st = new Student("12347567", "Kate", "Smith", "Java", 25);
            st.setAssessments(52,15,60);
            st.display();
        }catch (IllegalArgumentException ex){
            System.err.println(ex.getMessage());
        }catch (NoExamEntryException ex){
            System.err.println(ex.getMessage());
        }

    }
}
