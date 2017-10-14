package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

/**
 * Created by User on 09.10.2017.
 */
public class ContactDeletionTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        app.goTo().homePage();
        if (app.contact().list().size() == 0) {
            app.goTo().addContactPage();
            app.contact().create(new ContactData("name2","middlename2","wefw",
                    "111122","223323","33333333","gwggwr@ewfw.ru","wefw@mail.ru","rffw","efwef","test1"));
            app.goTo().homePage();
        }
    }

    @Test(enabled = false)
    public void testContactDeletion() {
        List<ContactData> before= app.contact().list();
        int index = before.size()-1;
        app.contact().delete(index);
        app.goTo().homePage();
        List<ContactData> after= app.contact().list();
        Assert.assertEquals(after.size(),index);
        before.remove(index);
        Assert.assertEquals(before,after);
    }
}
