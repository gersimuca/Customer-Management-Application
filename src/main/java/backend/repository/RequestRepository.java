package backend.repository;

public class RequestRepository {
//    private static EntityManagerFactory openConnectionEntityManagerFactory(){
//        return Persistence.createEntityManagerFactory("cma-prod");
//    }
//    public void createRequest(Client client , Requests request) {
//        EntityManagerFactory entityManagerFactory = openConnectionEntityManagerFactory();
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//
//        entityTransaction.begin();
//
//
//        Client dbClient = entityManager.find(Client.class, client.getId_client());
//        dbClient.getRequests().add(request);
//        entityManager.persist(request);
//
//        entityManager.getTransaction().commit();
//
//        entityManager.close();
//        entityManagerFactory.close();
//    }
//
//    public List<Requests> getAllRequest() {
//        EntityManagerFactory entityManagerFactory = openConnectionEntityManagerFactory();
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//
//        entityTransaction.begin();
//        List<Requests> requests;
//        Query query = entityManager.createQuery("SELECT m FROM Requests m", Requests.class);
//        requests = query.getResultList();
//        entityTransaction.commit();
//
//        entityManager.close();
//        entityManagerFactory.close();
//        return requests;
//    }
//
//    public List<Requests> getAllRequest(Client client) {
//        EntityManagerFactory entityManagerFactory = openConnectionEntityManagerFactory();
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//
//        entityTransaction.begin();
//        List<Requests> requests;
//        Query query = entityManager.createNativeQuery("SELECT * FROM requests WHERE requests.fk_request = " + client.getId_client(), Requests.class);
//        requests = query.getResultList();
//        entityTransaction.commit();
//
//        entityManager.close();
//        entityManagerFactory.close();
//        return requests;
//    }
//
//    public void deleteRequest(long id){
//        EntityManagerFactory entityManagerFactory = openConnectionEntityManagerFactory();
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//
//        entityTransaction.begin();
//        Requests requests = entityManager.find(Requests.class, id);
//        entityManager.remove(requests);
//        entityManager.getTransaction().commit();
//
//        entityManager.close();
//        entityManagerFactory.close();
//    }
//
//    public void updateRequest(Requests requests){
//        EntityManagerFactory entityManagerFactory = openConnectionEntityManagerFactory();
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//
//        entityTransaction.begin();
//        entityManager.merge(requests);
//        entityManager.getTransaction().commit();
//
//        entityManager.close();
//        entityManagerFactory.close();
//    }
//
//    public Requests findRequest(Requests request){
//        EntityManagerFactory entityManagerFactory = openConnectionEntityManagerFactory();
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//
//        entityTransaction.begin();
//        Requests requests = entityManager.find(Requests.class, request.getId_request());
//        entityManager.getTransaction().commit();
//
//        entityManager.close();
//        entityManagerFactory.close();
//        return requests;
//    }
}
