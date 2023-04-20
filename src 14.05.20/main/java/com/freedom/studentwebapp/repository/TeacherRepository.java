package com.freedom.studentwebapp.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import com.freedom.studentwebapp.entity.TeacherEntity;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Integer>, JpaSpecificationExecutor<TeacherEntity> {

//    @Override
//    public List<TeacherEntity> getList() {
//        final EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
//        final EntityManager em = emf.createEntityManager();
//        final Query sqlQuery = em.createQuery(
//            "select m from TeacherEntity m", TeacherEntity.class);
//
//        final List<TeacherEntity> resultList = sqlQuery.getResultList();
//
//        em.close();
//        return resultList;
//    }

//     public default List<TeacherEntity> getList(String name, String surname, BigDecimal salary) {


//    @Override
//    public TeacherEntity getById(Integer id)  {
//        final EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
//        final EntityManager em = emf.createEntityManager();
//
//        final TeacherEntity teacher = em.createNamedQuery("idyeGoreTap", TeacherEntity.class).getSingleResult();
//
//        em.close();
//
//        return teacher;
//    }

//    @Override
//    public TeacherEntity insert(TeacherEntity teacher) {
//        final EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
//        final EntityManager em = emf.createEntityManager();
//
//        em.getTransaction().begin();
//        em.persist(teacher);
//        em.getTransaction().commit();
//
//        em.close();
//        return teacher;
//    }

//    @Override
//    public boolean update(TeacherEntity teacher) {
//        final EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
//        EntityManager em = null;
//       try{
//           em = emf.createEntityManager();
//           em.getTransaction().begin();
//           em.merge(teacher);
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
//        final TeacherEntity teacher = em.find(TeacherEntity.class, id);
//        em.remove(teacher);
//        em.getTransaction().commit();
//
//        em.close();
//
//        return true;
//    }
//     }
}