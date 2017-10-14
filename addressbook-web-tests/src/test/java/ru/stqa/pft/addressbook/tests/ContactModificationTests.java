package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Set;

/**
 * Created by User on 09.10.2017.
 */
public class ContactModificationTests extends TestBase{

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
    public void testContactModification() {
        Set<ContactData> before = app.contact().all();
        ContactData modifiedContact = before.iterator().next();
        ContactData contact = new ContactData().withId(modifiedContact.getId()).withName("name2").withMiddleName("middlename2").withGroup("test1");
        app.contact().modify(contact);
        Set<ContactData> after = app.contact().all();
        before.remove(modifiedContact);
        before.add(contact);
        Assert.assertEquals(after,before);
    }


}
