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

package de.thb.ue.dto.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ChoiceDTO implements Serializable {
    @NonNull
    private String choiceText;
    @NonNull
    private short grade;

    @Deprecated // this method don't belong in a dto
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeUTF(choiceText);
        out.writeInt(grade);
    }

    @Deprecated // this method don't belong in a dto
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        choiceText = in.readUTF();
        grade = (short) in.readInt();
    }


}
