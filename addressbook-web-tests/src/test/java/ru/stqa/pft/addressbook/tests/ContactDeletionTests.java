package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

/**
 * Created by User on 09.10.2017.
 */
public class ContactDeletionTests extends TestBase{

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().gotoHomePage();

        if (! app.getContactHelper().isThereAContact()) {
            app.getNavigationHelper().gotoAddContactPage();
            app.getContactHelper().createContact(new ContactData("name2","middlename2","wefw",
                    "111122","223323","33333333","gwggwr@ewfw.ru","wefw@mail.ru","rffw","efwef","test1"));
            app.getNavigationHelper().gotoHomePage();
        }
        List<ContactData> before= app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().deleteSelectedContacts();
        app.getContactHelper().confirmationContactDeletion();
        List<ContactData> after= app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(),before.size() - 1);
        before.remove(before.size() - 1);
        Assert.assertEquals(before,after);
    }
}
