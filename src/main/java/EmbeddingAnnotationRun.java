import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddingAnnotationRun {


    public static void main(String[] args) {

        Configuration config = new Configuration();
        config.configure();
        SessionFactory factory = config.buildSessionFactory();

        Student student = new Student();
        student.setStudentId(5);
        student.setName("Chandni Bagga");
        student.setCity("Faridabad");

        Certificate certificate = new Certificate();
        certificate.setCourse("Java Programming");
        certificate.setDuration("10 Weeks");
        certificate.setTeacher("Tim Bachukala");
        student.setCertificate(certificate);


        Student student2 = new Student();
        student2.setStudentId(6);
        student2.setName("Nitika Saun");
        student2.setCity("Pithoragarh");

        Certificate certificate2 = new Certificate();
        certificate2.setCourse("Software Testing");
        certificate2.setDuration("15 Weeks");
        certificate2.setTeacher("Manisha Aggarwal");
        student2.setCertificate(certificate2);

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(student);
        session.save(student2);

        transaction.commit();
        session.close();
        factory.close();
    }
}
