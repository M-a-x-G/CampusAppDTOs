package de.fhb.ca.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnswersDTO {
    private String voteToken;
    private String studyPath;
    private Map<String, String> answers;

}
