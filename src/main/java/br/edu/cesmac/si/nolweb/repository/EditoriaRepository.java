package br.edu.cesmac.si.nolweb.repository;
import br.edu.cesmac.si.nolweb.domain.Editoria;
import br.edu.cesmac.si.nolweb.jpa.JpaUtil;
import javax.persistence.EntityManager;
public class EditoriaRepository {

    public void cadastrar(Editoria editoria) {
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(editoria);
        em.getTransaction().commit();
        em.close();
    }

    public void alterar(Editoria editoria) {
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(editoria);
        em.getTransaction().commit();
        em.close();
    }

    public void remover(Editoria editoria) {
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        editoria = em.merge(editoria);
        em.remove(editoria);
        em.getTransaction().commit();
        em.close();
    }

}