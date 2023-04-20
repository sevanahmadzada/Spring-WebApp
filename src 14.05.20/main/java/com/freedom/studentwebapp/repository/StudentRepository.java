package com.freedom.studentwebapp.repository;

import com.freedom.studentwebapp.entity.student.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>, JpaSpecificationExecutor<StudentEntity> {

//    @Override
//    public List<StudentEntity> getList() {
//        final EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
//        final EntityManager em = emf.createEntityManager();
//        final Query sqlQuery = em.createQuery(
//            "select m from StudentEntity m", StudentEntity.class);
//
//        final List<StudentEntity> resultList = sqlQuery.getResultList();
//
//        em.close();
//        return resultList;
//    }

//     public default List<StudentEntity> getList(String name, String surname, BigDecimal salary) {


//    @Override
//    public StudentEntity getById(Integer id)  {
//        final EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
//        final EntityManager em = emf.createEntityManager();
//
//        final StudentEntity Student = em.createNamedQuery("idyeGoreTap", StudentEntity.class).getSingleResult();
//
//        em.close();
//
//        return Student;
//    }

//    @Override
//    public StudentEntity insert(StudentEntity Student) {
//        final EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
//        final EntityManager em = emf.createEntityManager();
//
//        em.getTransaction().begin();
//        em.persist(Student);
//        em.getTransaction().commit();
//
//        em.close();
//        return Student;
//    }

//    @Override
//    public boolean update(StudentEntity Student) {
//        final EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
//        EntityManager em = null;
//       try{
//           em = emf.createEntityManager();
//           em.getTransaction().begin();
//           em.merge(Student);
//           em.getTransaction().commit();
//       }catch (Exception e) {
//           if(em!=null) {
//               em.getTransaction().rollback();
//           }
//       }finally {
//         em.close();
//       }
//        return true;
//    }

//    @Override
//    public boolean delete(Integer id){
//        final EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
//        final EntityManager em = emf.createEntityManager();
//
//        em.getTransaction().begin();
//        final StudentEntity Student = em.find(StudentEntity.class, id);
//        em.remove(Student);
//        em.getTransaction().commit();
//
//        em.close();
//
//        return true;
//    }
//     }
}