package com.freedom.studentwebapp.mapper;

import com.freedom.studentwebapp.entity.TeacherEntity;
import com.freedom.studentwebapp.entity.UniversityEntity;
import com.freedom.studentwebapp.restcontroller.dto.request.TeacherInsertRequestDTO;
import com.freedom.studentwebapp.restcontroller.dto.request.TeacherUpdateRequestDTO;
import com.freedom.studentwebapp.restcontroller.dto.response.TeacherResponseDTO;
import com.freedom.studentwebapp.service.dto.TeacherDTO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-13T23:18:49+0100",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 18 (Oracle Corporation)"
)
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public TeacherDTO toTeacherDTO(TeacherInsertRequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        TeacherDTO teacherDTO = new TeacherDTO();

        teacherDTO.setName( requestDTO.getName() );
        teacherDTO.setSurname( requestDTO.getSurname() );
        teacherDTO.setSalary( requestDTO.getSalary() );
        teacherDTO.setUniversityId( requestDTO.getUniversityId() );

        return teacherDTO;
    }

    @Override
    public TeacherDTO toTeacherDTO(TeacherEntity teacherEntity) {
        if ( teacherEntity == null ) {
            return null;
        }

        TeacherDTO teacherDTO = new TeacherDTO();

        teacherDTO.setUniversityId( teacherEntityUniversityIdId( teacherEntity ) );
        teacherDTO.setId( teacherEntity.getId() );
        teacherDTO.setName( teacherEntity.getName() );
        teacherDTO.setSurname( teacherEntity.getSurname() );
        teacherDTO.setSalary( teacherEntity.getSalary() );

        return teacherDTO;
    }

    @Override
    public TeacherEntity toTeacherEntity(TeacherDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TeacherEntity teacherEntity = new TeacherEntity();

        teacherEntity.setUniversityId( teacherDTOToUniversityEntity( dto ) );
        teacherEntity.setId( dto.getId() );
        teacherEntity.setName( dto.getName() );
        teacherEntity.setSurname( dto.getSurname() );
        teacherEntity.setSalary( dto.getSalary() );

        return teacherEntity;
    }

    @Override
    public TeacherEntity toTeacherEntity(TeacherUpdateRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TeacherEntity teacherEntity = new TeacherEntity();

        teacherEntity.setUniversityId( teacherUpdateRequestDTOToUniversityEntity( dto ) );
        teacherEntity.setId( dto.getId() );
        teacherEntity.setName( dto.getName() );
        teacherEntity.setSurname( dto.getSurname() );
        teacherEntity.setSalary( dto.getSalary() );

        return teacherEntity;
    }

    @Override
    public TeacherResponseDTO toTeacherResponseDTO(TeacherEntity teacherEntiy) {
        if ( teacherEntiy == null ) {
            return null;
        }

        TeacherResponseDTO teacherResponseDTO = new TeacherResponseDTO();

        teacherResponseDTO.setUniversityId( teacherEntityUniversityIdId( teacherEntiy ) );
        teacherResponseDTO.setId( teacherEntiy.getId() );
        teacherResponseDTO.setName( teacherEntiy.getName() );
        teacherResponseDTO.setSurname( teacherEntiy.getSurname() );
        teacherResponseDTO.setSalary( teacherEntiy.getSalary() );

        return teacherResponseDTO;
    }

    private Integer teacherEntityUniversityIdId(TeacherEntity teacherEntity) {
        if ( teacherEntity == null ) {
            return null;
        }
        UniversityEntity universityId = teacherEntity.getUniversityId();
        if ( universityId == null ) {
            return null;
        }
        Integer id = universityId.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected UniversityEntity teacherDTOToUniversityEntity(TeacherDTO teacherDTO) {
        if ( teacherDTO == null ) {
            return null;
        }

        UniversityEntity universityEntity = new UniversityEntity();

        universityEntity.setId( teacherDTO.getUniversityId() );

        return universityEntity;
    }

    protected UniversityEntity teacherUpdateRequestDTOToUniversityEntity(TeacherUpdateRequestDTO teacherUpdateRequestDTO) {
        if ( teacherUpdateRequestDTO == null ) {
            return null;
        }

        UniversityEntity universityEntity = new UniversityEntity();

        universityEntity.setId( teacherUpdateRequestDTO.getUniversityId() );

        return universityEntity;
    }
}
