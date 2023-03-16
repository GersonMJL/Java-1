package org.exemple;

public class Client {
    private String name;
    private String cpf;
    private String profession;

    public Client(String cpf) {
        if (validateCPF(cpf)){
            this.cpf = cpf;
        } else {
            throw new RuntimeException("CPF is not valid.");
        }
    }

    public static boolean validateCPF(String cpf) {
        // validation goes here.
        return true;
    }
    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
