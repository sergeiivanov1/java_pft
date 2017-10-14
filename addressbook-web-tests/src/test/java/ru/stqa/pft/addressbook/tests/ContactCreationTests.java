package ru.stqa.pft.addressbook.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.util.Set;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.goTo().homePage();
        Contacts before = app.contact().all();
        app.goTo().addContactPage();
        ContactData contact = new ContactData().withName("name2").withMiddleName("middlename2").withGroup("test1");
        app.contact().create(contact);
        Contacts after = app.contact().all();
        //Assert.assertEquals(after.size(),before.size() + 1);
        MatcherAssert.assertThat(after, CoreMatchers.equalTo(before.withAdded(contact.withId(after.stream().mapToInt((c1) -> c1.getId()).max().getAsInt()))));
    }

}
