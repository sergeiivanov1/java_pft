package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {
    @Test
    public void testContactCreation(ContactData contactData) {
        app.getNavigationHelper().gotoAddContactPage();
        app.getContactHelper().fillContactForm(contactData);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }

}
