import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
    // we will work on get and load

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();


        //using get: GET-STUDENT ID =3

        Student fetchStudent = (Student)session.get(Student.class, 2 );
        System.out.println(fetchStudent);

        //using load : Load- Student_Address, ID = 1
        StudentAddress fetchStudentAddress = (StudentAddress) session.load(StudentAddress.class, 2);
        System.out.println("Address of the student:- " + fetchStudentAddress.getStreet() + ", "+fetchStudentAddress.getCity() + ", " + fetchStudentAddress.getCountry() + "." );

        session.close();
        factory.close();
    }


}
