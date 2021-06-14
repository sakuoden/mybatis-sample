package jtn.sample.dentalclinic;

import java.util.UUID;

public class ClinicNumber {
    String value;

    public ClinicNumber(String clinicNumber) {
        this.value = clinicNumber;
    }

    public static ClinicNumber issue() {
        UUID uuid = UUID.randomUUID();
        return new ClinicNumber(uuid.toString());
    }
}
