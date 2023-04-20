package com.freedom.studentwebapp.restcontroller;

import com.freedom.studentwebapp.entity.TeacherEntity;
import com.freedom.studentwebapp.mapper.TeacherMapper;
import com.freedom.studentwebapp.restcontroller.dto.request.TeacherUpdateRequestDTO;
import com.freedom.studentwebapp.restcontroller.dto.response.ResponseDto;
import com.freedom.studentwebapp.restcontroller.dto.request.TeacherInsertRequestDTO;
import com.freedom.studentwebapp.restcontroller.dto.response.TeacherInsertResponseDTO;
import com.freedom.studentwebapp.restcontroller.dto.response.TeacherResponseDTO;
import com.freedom.studentwebapp.service.TeacherService;
import com.freedom.studentwebapp.service.dto.TeacherDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*Inversion of Control (IoC) means to create instances of dependencies first and latter instance of a class
(optionally injecting them through constructor), instead of creating an instance of the class first and then
the class instance creating instances of dependencies. Thus, inversion of control inverts
the flow of control of the program. Instead of the callee controlling the flow of control
(while creating dependencies), the caller controls the flow of control of the program.
*/

@RestController
@RequestMapping(value = "teachers")
public class TeacherRestController {
    //@Autowired deyende @Service-in yaratdigi objecti - menimsedir
//menimsetme 2 cur olur-reflectionAPI ve Constructor ichinde reponun service-in obj-in intlze edirsn(bu meslehetli usuldu)
    /*
     * 1.Classda annot @Service@Repo yazilmasiVeobjecting Spring terefinden yaradilmasi Container/Context(Invers Of Control)
     * 2.Yaradilan objectin diger Objectin ichinde yaradilmasi(Dependency Inversion)
     * Yeni classin ichinde bashqa classin objectinin yaradilmasi ve Constructora oturulmesi
     * 3. Inject ede bilme sebebi 1-classlarin bashinda component yazilibki , onlarin objectlerini yaradir
     * 2- hara inject edirsense oranin da objecti yaranir  
     * */

    @Autowired
    private TeacherService teacherService;

    public TeacherRestController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    //    @RequestMapping(method = RequestMethod.GET)  =    @GetMapping
    @GetMapping

    public ResponseDto<List<TeacherResponseDTO>> getListA(@RequestParam(required = false) String name,
                                                          @RequestParam(required = false) String surname,
                                                          @RequestParam(required = false) BigDecimal salary) {
        List<TeacherEntity> list = teacherService.getList(name, surname, salary);

        List<TeacherResponseDTO> data = new ArrayList<>();
        for (TeacherEntity teacher : list) {
            data.add(TeacherMapper.INSTANCE.toTeacherResponseDTO(teacher));
        }
        ResponseDto<List<TeacherResponseDTO>> responseDTO = new ResponseDto<>();
        responseDTO.setData(data);
        return responseDTO;
    }

    @GetMapping("/{id}")
    public ResponseDto<TeacherResponseDTO> getItem(@PathVariable(required = false, name = "id") Integer id) {
        TeacherEntity teacherEntity = teacherService.findById(id);
        return ResponseDto.ok(TeacherMapper.INSTANCE.toTeacherResponseDTO(teacherEntity));
    }

    @PostMapping
    public ResponseDto<TeacherInsertResponseDTO> add(@RequestBody TeacherInsertRequestDTO teacherRequestDTO) {
        TeacherDTO teacherDTO = TeacherMapper.INSTANCE.toTeacherDTO(teacherRequestDTO);

        TeacherDTO addResult = teacherService.add(teacherDTO);

        TeacherInsertResponseDTO teacherInsertResponseDTO = new TeacherInsertResponseDTO();
        teacherInsertResponseDTO.setId(addResult.getId());

        return ResponseDto.ok(teacherInsertResponseDTO);
    }

    @PutMapping
    public ResponseDto<Boolean> update(@RequestBody TeacherUpdateRequestDTO teacher) {
        TeacherEntity teacherEntity = TeacherMapper.INSTANCE.toTeacherEntity(teacher);
        Boolean result = teacherService.update(teacherEntity) != null;

        return ResponseDto.ok(result);
    }

    @DeleteMapping
    public ResponseDto<Boolean> delete(@RequestParam Integer id) {
        teacherService.deleteById(id);

        return ResponseDto.ok(true);
    }
}
