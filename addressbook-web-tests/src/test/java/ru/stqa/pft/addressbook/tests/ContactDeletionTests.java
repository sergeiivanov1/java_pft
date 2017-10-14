package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Set;

/**
 * Created by User on 09.10.2017.
 */
public class ContactDeletionTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        app.goTo().homePage();
        if (app.contact().all().size() == 0) {
            app.goTo().addContactPage();
            app.contact().create(new ContactData().withName("name2").withMiddleName("middlename2"));
            app.goTo().homePage();
        }
    }

    @Test(enabled = false)
    public void testContactDeletion() {
        Set<ContactData> before= app.contact().all();
        ContactData deletedContact = before.iterator().next();
        app.contact().delete(deletedContact);
        app.goTo().homePage();
        Set<ContactData> after= app.contact().all();
        Assert.assertEquals(after.size(),before.size() - 1);
        before.remove(deletedContact);
        Assert.assertEquals(before,after);
    }
}
