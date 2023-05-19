package com.heydoctor.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class QuestionVO {
    private Long questionId;
    private Long userId;
    private String questionTitle;
    private String questionContent;
    private String questionRegisterDateTime;
    private Boolean questionIsPublic;
    private Long questionLikeCount;
    private String doctorDepartmentType;
    private Long readCount;
}
