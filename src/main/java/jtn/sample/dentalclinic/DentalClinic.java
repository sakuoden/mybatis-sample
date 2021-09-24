package jtn.sample.dentalclinic;

public class DentalClinic {
    ClinicNumber clinicNumber;
    ClinicName clinicName;

    public DentalClinic() {}

    public DentalClinic(
            ClinicNumber clinicNumber,
            ClinicName clinicName
    ) {
        this.clinicNumber = clinicNumber;
        this.clinicName = clinicName;
    }

    public void setClinicName(ClinicName clinicName) {
        this.clinicName = clinicName;
    }

    public void setClinicNumber(ClinicNumber clinicNumber) {
        this.clinicNumber = clinicNumber;
    }
}
