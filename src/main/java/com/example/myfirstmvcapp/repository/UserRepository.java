package com.example.myfirstmvcapp.repository;

import com.example.myfirstmvcapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {


    @Query("select u from User u where u.firstName like %?1% or u.lastName like %?2%")
    List<User> findByFirstNameContainingOrLastNameContaining(String first_name, String last_name);


//    EntityManagerFactory em = Persistence.createEntityManagerFactory("jpa");

//    public default List<User> findByName(String user_name) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
//        EntityManager em = emf.createEntityManager();
//        try {
//            EntityTransaction entr = em.getTransaction();
//            entr.begin();
//            Query query = em.createQuery("select * from User u where u.firstName like lower() ");
//            List stuList = query.getResultList();
//            Iterator stuIterator = stuList.iterator();
//            while (stuIterator.hasNext()) {
//                Student st = (Student) stuIterator.next();
//                System.out.print("sname:" + st.getSname());
//                System.out.println();
//            }
//        } finally {
//            em.close();
//        }
//        return null;
//    }


//       List<User> findByFirstNameTrimIgnoreCaseContains(String first_name);
//       List<User> findByFirstNameIgnoreCaseOrLastNameIgnoreCase(String first_name, String last_name);

}
