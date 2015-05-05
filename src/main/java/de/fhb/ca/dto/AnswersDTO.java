package de.fhb.ca.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnswersDTO {

    private String token;
    private Map<String, String> textAnswers;
    private Map<String, Short> mcAnswers;

}
