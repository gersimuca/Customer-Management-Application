package backend.repository;

public class ClientRepository {
//    private static EntityManagerFactory openConnectionEntityManagerFactory(){
//        return Persistence.createEntityManagerFactory("cma-prod");
//    }
//    public Client updateClient(Client client) {
//        EntityManagerFactory entityManagerFactory = openConnectionEntityManagerFactory();
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//
//
//        entityTransaction.begin();
//        entityManager.merge(client);
//        entityTransaction.commit();
//
//        entityManager.close();
//        entityManagerFactory.close();
//
//        return client;
//    }
//    public void createClient(Client client) {
//        EntityManagerFactory entityManagerFactory = openConnectionEntityManagerFactory();
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//
//        entityTransaction.begin();
//        entityManager.persist(client);
//        entityManager.getTransaction().commit();
//
//        entityManager.close();
//        entityManagerFactory.close();
//    }
//    public Client login(String email, String password){
//        EntityManagerFactory entityManagerFactory = openConnectionEntityManagerFactory();
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//
//        entityTransaction.begin();
//        List<Client> clients;
//        Client client = null;
//
//        Query query = entityManager.createQuery("SELECT m FROM Client m WHERE m.email = :email AND m.password = :password", Client.class)
//                .setParameter("email", email)
//                .setParameter("password", password);
//
//        clients = query.getResultList();
//
//        for(Client samples : clients) {
//            if(samples.getEmail().equals(email) && samples.getPassword().equals(password)) {
//                client = samples;
//                break;
//            }
//        }
//        entityTransaction.commit();
//
//        entityManager.close();
//        entityManagerFactory.close();
//
//        return client;
//    }
//    public void deleted(Long id) {
//        EntityManagerFactory entityManagerFactory = openConnectionEntityManagerFactory();
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//
//        entityTransaction.begin();
//        Client client = entityManager.find(Client.class, id);
//        if(client != null) entityManager.remove(client);
//        entityTransaction.commit();
//
//        entityManager.close();
//        entityManagerFactory.close();
//    }
}
