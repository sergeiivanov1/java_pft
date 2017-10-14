package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

/**
 * Created by User on 09.10.2017.
 */
public class ContactModificationTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        app.goTo().homePage();
        if (app.contact().list().size() == 0) {
            app.goTo().addContactPage();
            app.contact().create(new ContactData().withName("name2").withMiddleName("middlename2"));
            app.goTo().homePage();
        }
    }

    @Test(enabled = false)
    public void testContactModification() {
        List<ContactData> before = app.contact().list();
        int index = before.size() - 1;
        ContactData contact = new ContactData().withName("name2").withMiddleName("middlename2").withGroup("test1");
        app.contact().modify(index, contact);
        List<ContactData> after = app.contact().list();
        before.remove(index);
        before.add(contact);
        Comparator<? super ContactData> byId = Comparator.comparingInt(ContactData::getId);
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(after,before);
    }


}
