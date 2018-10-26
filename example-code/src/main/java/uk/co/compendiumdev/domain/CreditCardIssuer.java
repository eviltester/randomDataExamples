package uk.co.compendiumdev.domain;

public class CreditCardIssuer {

    public boolean canIssueCreditCardTo(Person customer){

        if(customer.getAge()>=18){
            return true;
        }

        return false;
    }
}
