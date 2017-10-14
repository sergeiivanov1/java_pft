package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends TestBase {

    @Test(enabled = false)
    public void testContactCreation() {
        app.goTo().homePage();
        List<ContactData> before = app.contact().list();
        app.goTo().addContactPage();
        ContactData contact = new ContactData("name2","middlename2","wefw",
                "111122","223323","33333333","gwggwr@ewfw.ru","wefw@mail.ru","rffw","efwef","test1");
        app.contact().create(contact);

        List<ContactData> after = app.contact().list();
        before.add(contact);
        Assert.assertEquals(after.size(),before.size());
        Comparator<? super ContactData> byId = Comparator.comparingInt(ContactData::getId);
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }

}
