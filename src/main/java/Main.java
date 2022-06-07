import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {


    public static void main(String[] args) throws IOException {

        System.out.println("Project Started........");

        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();

        //or we can use one liner code like below:-
        //SessionFactory factory = new Configuration().configure().buildSessionFactory();


        //creating student
        Student student = new Student();

        student.setStudentId(2);
        student.setName("Kartik");
        student.setCity("Delhi");

        System.out.println(student);

        //creating object of StudentAddress Class

        StudentAddress studentAddress = new StudentAddress();
        studentAddress.setStreet("GBM Road, Chandni Chowk");
        studentAddress.setCity("Delhi");
        studentAddress.setCountry("India");
        studentAddress.setOpen(true);
        studentAddress.setAddedDate(new Date());
        studentAddress.setX(556.55);

        //Reading Image
//        FileInputStream fis = new FileInputStream("src/main/java/trek.png");
//
//        byte[] storeImg = new byte[fis.available()];
//        fis.read(storeImg);
//        studentAddress.setImage(storeImg);


        //save student object using Session

        Session session = factory.openSession();
        session.beginTransaction();
        session.save(student);
        session.save(studentAddress);
        session.getTransaction().commit();
        session.close();
        System.out.println("Done......");

    }
}
