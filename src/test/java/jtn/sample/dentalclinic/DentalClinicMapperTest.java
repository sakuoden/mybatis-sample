package jtn.sample.dentalclinic;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
public class DentalClinicMapperTest {
    @Autowired
    DentalClinicMapper dentalClinicMapper;

    @Test
    void オブジェクトをレコードに_レコードをオブジェクトにマッピングする() {
        ClinicNumber newClinicNumber = ClinicNumber.issue();

        DentalClinic dentalClinic = new DentalClinic(
                newClinicNumber,
                new ClinicName("ファミリー歯科")
        );

        dentalClinicMapper.insert(dentalClinic);

        DentalClinic insertedDentalClinic = dentalClinicMapper.find(newClinicNumber).orElseThrow();
        assertEquals("ファミリー歯科", insertedDentalClinic.clinicName.value);
    }
}
