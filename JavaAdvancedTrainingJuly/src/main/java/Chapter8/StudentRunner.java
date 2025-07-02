package Chapter8;


public class StudentRunner {
    public static void main(String[] args) {

        try{
            Student st = new Student("123456", "Ka", "Smith", "Java", 25);
            st.display();
        }catch (IllegalArgumentException ex){
            System.err.println(ex.getMessage());
        }

    }
}
