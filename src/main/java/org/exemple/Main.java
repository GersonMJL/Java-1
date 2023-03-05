package org.exemple;

public class Main {
    public static void main(String[] args) {

        // Creating Clients.
        Client maria = new Client("111.111.111-11");
        Client jose = new Client("222.222.222-22");
        Client mateus = new Client("333.333.333-33");

        maria.setName("Maria");
        jose.setName("José");
        mateus.setName("Mateus");
    }
}
