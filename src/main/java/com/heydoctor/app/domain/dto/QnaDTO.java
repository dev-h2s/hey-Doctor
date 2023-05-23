package com.heydoctor.app.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class QnaDTO {
    private Long qnaId;
    private Long userId;
    private String qnaTitle;
    private String qnaContent;
    private String qnaRegisterDateTime;
    private Boolean qnaIsPublic;
    private String userEmail;
    private String userName;
}
