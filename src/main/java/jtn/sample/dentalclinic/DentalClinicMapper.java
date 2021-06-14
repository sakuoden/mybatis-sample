package jtn.sample.dentalclinic;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

@Mapper
public interface DentalClinicMapper {
    void insert(@Param("dentalClinic") DentalClinic dentalClinic);

    Optional<DentalClinic> find(@Param("clinicNumber") ClinicNumber clinicNumber);
}
