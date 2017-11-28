package net.subseq.challenge.data;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;

import java.util.Locale;

public class RandomData {

    public static final Fairy fairy = Fairy.create(Locale.GERMAN);

    public static SampleRandomObject getSampleRandomDataObject() {
        SampleRandomObject sampleRandomObject = new SampleRandomObject();
        Person person = fairy.person();

        sampleRandomObject.name = person.getFullName();
        sampleRandomObject.address = person.getAddress().getAddressLine1() + " " + person.getAddress().getAddressLine2() + " " + person.getTelephoneNumber();

        return sampleRandomObject;
    }

}
