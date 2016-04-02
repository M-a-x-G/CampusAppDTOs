/*
 * Copyright 2016 Max Gregor, Sebastian Müller
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.thb.ue.dto;

import java.util.List;

import de.thb.ue.dto.util.TextQuestionDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionsDTO {
    @NonNull
    private List<String> studyPaths;
    @NonNull
    private List<TextQuestionDTO> textQuestions;
    @NonNull
    private List<MultipleChoiceQuestionDTO> multipleChoiceQuestionDTOs;
    @NonNull
    private Boolean textQuestionsFirst;
}
