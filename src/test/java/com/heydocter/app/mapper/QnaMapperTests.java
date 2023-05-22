package com.heydocter.app.mapper;


import com.heydoctor.app.HeydocterApplication;
import com.heydoctor.app.domain.enums.DepartmentType;
import com.heydoctor.app.domain.enums.QuestionType;
import com.heydoctor.app.domain.vo.QnaVO;
import com.heydoctor.app.domain.dto.QnaDTO;
import com.heydoctor.app.domain.vo.QuestionVO;
import com.heydoctor.app.mapper.QnaMapper;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = HeydocterApplication.class)
@Slf4j
public class QnaMapperTests {

    @Autowired
    private QnaMapper qnaMapper;

    private Long qnaId;
    private Long userId;
    private String qnaTitle;
    private String qnaContent;
    private String qnaRegisterDateTime;
    private Boolean qnaIsPublic;
    private String doctorDepartmentType;


    @Test
    public void insertTest() {
        QnaVO qnaVO = new QnaVO();
        qnaVO.setUserId(1L);
        qnaVO.setQnaTitle("test title3");
        qnaVO.setQnaContent("test content3");
        qnaVO.setQnaIsPublic(QuestionType.PUBLIC.isPublic());
        qnaVO.setDoctorDepartmentType(DepartmentType.MENTAL_HEALTH.getType());
        qnaMapper.insert(qnaVO);
    }

    @Test
    public void selectListTest() {
        AssertionsForClassTypes.assertThat(qnaMapper.selectList(0).size()).isEqualTo(3);
    }

    @Test
    public void selectOneTest() {
        qnaMapper.selectOne(12L).map(QnaDTO::getUserName).ifPresent(log::info);
    }

    @Test
    public void deleteTest() {
        qnaMapper.delete(13L);
        assertThat(qnaMapper.selectList(0)).hasSize(2);
    }
}