package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by User on 09.10.2017.
 */
public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getNavigationHelper().gotoAddContactPage();
            app.getContactHelper().createContact(new ContactData("name2","middlename2","wefw",
                    "111122","223323","33333333","gwggwr@ewfw.ru","wefw@mail.ru","rffw","efwef","test1"));
            app.getNavigationHelper().gotoHomePage();
        }
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm( new ContactData("name2","middlename2","wefw",
                "111122","223323","33333333","gwggwr@ewfw.ru","wefw@mail.ru","rffw","efwef",null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }
}
