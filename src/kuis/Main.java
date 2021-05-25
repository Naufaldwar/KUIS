/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Main {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ContactsManager myContactsManager = new ContactsManager();
        Contact ninda = new Contact("Ninda Nur Faizah Ariani", "eninariani@gmail.com", "085885897391");
        myContactsManager.addContact(ninda);
        Contact ikhda = new Contact("Ikhda Miftakhul Ulumi", "miftakhul30@gmail.com", "081189846519");
        myContactsManager.addContact(ikhda);
        Contact nanda = new Contact("Nanda Nur Faizah Ariani", "nannur25@gmail.com", "0857898872649");
        myContactsManager.addContact(nanda);
        Contact dedi = new Contact("Dedi Mumtazul Umam", "dedimumtazul@gmail.com", "08533562324245");
        myContactsManager.addContact(dedi);
        Contact bayu = new Contact("Bayu Tri Nugroho", "bayuu3@gmail.com", "0877875657321");
        myContactsManager.addContact(bayu);
        
        String isAgain = "y";
        String searchName;
        while("y".equals(isAgain)){
            System.out.print("Search Name : ");
            searchName = input.nextLine();
            if(myContactsManager.searchContact(searchName).getName() == null){
                System.out.println("looking for "+ searchName + "'s contact.. ");
                System.out.println(searchName +"'s Contact Not Found!");
            }
            else{
                System.out.println("looking for "+ searchName + "'s contact.. ");
                System.out.println("Name     : "+myContactsManager.searchContact(searchName).getName());
                System.out.println("Number   : "+myContactsManager.searchContact(searchName).getPhoneNumber());
                System.out.println("Email    : "+myContactsManager.searchContact(searchName).getEmail());
            }
            System.out.print("\nAgain? (y/n) : ");
            isAgain = input.nextLine();
        }
    }
    
}

