package de.fhb.ca.dto.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TextQuestionDTO {
    @NonNull
    private int questionID;
    @NonNull
    private String questionText;
    @NonNull
    private Boolean onlyNumbers;
    @NonNull
    private Integer maxLength;
}
