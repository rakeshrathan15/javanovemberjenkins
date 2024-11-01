package com.neoteric.javademojenkins;

public class AccountTest {

    public static void main(String[] args) {

        System.out.println("This is from Account class and public constructor and static variables  ");
        Account account= new Account("Rakesh","999999","Srpt");
        account.getAccountNumber();
        account.getHolderName();
        account.getAddress();
        account.setBankName("HDFC");

        account.getBankName();
        account.setBankName("SBI");
        account.setBankName("HDFC2");  // we can overide static variable when we update
                                        // the value it is updating everytime

        System.out.println("bank name "+account.getBankName());


        Account account1= new Account();
        account1.setAccountNumber("88888");
        Account.setBankName("ICIC");
        Account.getBankName();

        System.out.println("bank name "+Account.getBankName());
        System.out.println();
        System.out.println("----------------------------------------------------------");

        System.out.println("This is from Address class and private constructor   ");


        System.out.println(" Address    "+ Address.getInstance().getCity());

        System.out.println("This is from private Address class and private constructor  and static varaibles ");
        AddressStaticVariables.getInstance();
        System.out.println("private constructor"+AddressStaticVariables.getInstance());
      //  System.out.println(AddressStaticVariables);









    }
}
