//package frontend.model;
//
//import backend.model.Client;
//import backend.model.Product;
//import backend.model.Requests;
//import backend.repository.ClientRepository;
//import backend.repository.ProductRepository;
//import backend.repository.RequestRepository;
//import frontend.controller.ClientPanelController;
//import frontend.view.responses.EmailExistError;
//import frontend.view.ClientPanelView;
//import frontend.view.IndexView;
//
//import javax.persistence.RollbackException;
//import javax.swing.*;
//import java.util.List;
//
//public class ClientPanelModel implements ClientPanelController {
//    private final ClientRepository clientRepository = new ClientRepository();
//    private final RequestRepository requestRepository = new RequestRepository();
//    private final ProductRepository productRepository = new ProductRepository();
//
//    @Override
//    public void updateProfile(ClientPanelView clientPanelView, JButton button) {
//        button.addActionListener(e -> {
//            Client client = clientPanelView.getClient();
//
//            client.setFirstName(clientPanelView.getFirstNameField().getText());
//            client.setLastName(clientPanelView.getLastNameField().getText());
//            client.setEmail(clientPanelView.getEmailField().getText());
//            client.setPassword(clientPanelView.getPasswordField().getText());
//
//            try {
//                client = clientRepository.updateClient(client);
//            } catch (RollbackException rbe){
//                rbe.printStackTrace();
//                new EmailExistError();
//                return;
//            }
//            clientPanelView.dispose();
//            new ClientPanelView(client);
//        });
//    }
//
//    @Override
//    public void logOut(ClientPanelView clientPanelView, JButton button) {
//        button.addActionListener(e -> {
//            clientPanelView.dispose();
//            new IndexView();
//        });
//    }
//
//    @Override
//    public void deleteAccount(ClientPanelView clientPanelView, JButton button) {
//        button.addActionListener(e -> {
//            clientRepository.deleted(clientPanelView.getClient().getId_client());
//            clientPanelView.dispose();
//            new IndexView();
//        });
//    }
//
//    @Override
//    public void createRequest(ClientPanelView clientPanelView, JButton button, JComboBox<String> products) {
//        button.addActionListener(e -> {
//            Requests request = new Requests();
//            request.setProductName(clientPanelView.getProductJComboBox().getSelectedItem().toString());
//
//            for (int i = 0; i < clientPanelView.getQuantityField().getText().length(); i++) {
//                char ch = clientPanelView.getQuantityField().getText().charAt(i);
//                if (Character.isLetter(ch)) return;
//            }
//            request.setQuantity(Integer.parseInt(clientPanelView.getQuantityField().getText()));
//            requestRepository.createRequest(clientPanelView.getClient(), request);
//            clientPanelView.dispose();
//            new ClientPanelView(clientPanelView.getClient());
//        });
//    }
//
//    @Override
//    public List<Requests> allRequest(Client client) {
//        return requestRepository.getAllRequest(client);
//    }
//
//    @Override
//    public List<Product> allProducts() {
//        return productRepository.getAllProducts();
//    }
//
//    @Override
//    public void deleteRequest(ClientPanelView clientPanelView, JButton button, JComboBox<String> requestJCombo) {
//        button.addActionListener(e -> {
//            Requests request = new Requests();
//            String temp = requestJCombo.getSelectedItem().toString();
//            StringBuilder name = new StringBuilder();
//            for (int i = 3; i < temp.length(); i++) {
//                if (temp.charAt(i) == ' ') break;
//                name.append(temp.charAt(i));
//            }
//            request.setId_request((long) Integer.parseInt(name.toString()));
//
//            request = requestRepository.findRequest(request);
//            requestRepository.deleteRequest(request.getId_request());
//            clientPanelView.dispose();
//            new ClientPanelView(clientPanelView.getClient());
//        });
//    }
//
//}
//
