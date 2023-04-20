package com.freedom.studentwebapp.mapper;

import com.freedom.studentwebapp.entity.UniversityEntity;
import com.freedom.studentwebapp.entity.student.StudentEntity;
import com.freedom.studentwebapp.restcontroller.dto.request.StudentInsertRequestDto;
import com.freedom.studentwebapp.restcontroller.dto.request.StudentUpdateRequestDto;
import com.freedom.studentwebapp.restcontroller.dto.response.StudentResponseDto;
import com.freedom.studentwebapp.service.dto.StudentDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-13T23:18:50+0100",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 18 (Oracle Corporation)"
)
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDto toStudentDto(StudentInsertRequestDto requestDto) {
        if ( requestDto == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        studentDto.setName( requestDto.getName() );
        studentDto.setSurname( requestDto.getSurname() );
        studentDto.setScholarship( requestDto.getScholarship() );
        studentDto.setUniversityId( requestDto.getUniversityId() );

        return studentDto;
    }

    @Override
    public StudentDto toStudentDto(StudentEntity studentEntity) {
        if ( studentEntity == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        studentDto.setUniversityId( studentEntityUniversityIdId( studentEntity ) );
        studentDto.setId( studentEntity.getId() );
        studentDto.setName( studentEntity.getName() );
        studentDto.setSurname( studentEntity.getSurname() );
        studentDto.setScholarship( studentEntity.getScholarship() );

        return studentDto;
    }

    @Override
    public StudentEntity toStudentEntity(StudentDto dto) {
        if ( dto == null ) {
            return null;
        }

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setUniversityId( studentDtoToUniversityEntity( dto ) );
        studentEntity.setId( dto.getId() );
        studentEntity.setName( dto.getName() );
        studentEntity.setSurname( dto.getSurname() );
        studentEntity.setScholarship( dto.getScholarship() );

        return studentEntity;
    }

    @Override
    public StudentEntity toStudentEntity(StudentUpdateRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setUniversityId( studentUpdateRequestDtoToUniversityEntity( dto ) );
        studentEntity.setId( dto.getId() );
        studentEntity.setName( dto.getName() );
        studentEntity.setSurname( dto.getSurname() );
        studentEntity.setScholarship( dto.getScholarship() );

        return studentEntity;
    }

    @Override
    public StudentResponseDto toStudentResponseDto(StudentEntity studentEntity) {
        if ( studentEntity == null ) {
            return null;
        }

        StudentResponseDto studentResponseDto = new StudentResponseDto();

        studentResponseDto.setUniversityId( studentEntityUniversityIdId( studentEntity ) );
        studentResponseDto.setId( studentEntity.getId() );
        studentResponseDto.setName( studentEntity.getName() );
        studentResponseDto.setSurname( studentEntity.getSurname() );
        studentResponseDto.setScholarship( studentEntity.getScholarship() );

        return studentResponseDto;
    }

    private Integer studentEntityUniversityIdId(StudentEntity studentEntity) {
        if ( studentEntity == null ) {
            return null;
        }
        UniversityEntity universityId = studentEntity.getUniversityId();
        if ( universityId == null ) {
            return null;
        }
        Integer id = universityId.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected UniversityEntity studentDtoToUniversityEntity(StudentDto studentDto) {
        if ( studentDto == null ) {
            return null;
        }

        UniversityEntity universityEntity = new UniversityEntity();

        universityEntity.setId( studentDto.getUniversityId() );

        return universityEntity;
    }

    protected UniversityEntity studentUpdateRequestDtoToUniversityEntity(StudentUpdateRequestDto studentUpdateRequestDto) {
        if ( studentUpdateRequestDto == null ) {
            return null;
        }

        UniversityEntity universityEntity = new UniversityEntity();

        universityEntity.setId( studentUpdateRequestDto.getUniversityId() );

        return universityEntity;
    }
}
