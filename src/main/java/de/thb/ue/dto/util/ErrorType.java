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

public class ErrorType {
    public static final int UNKNOWN_ERROR = -1;
    public static final int INVALID_TOKEN = 1;
    public static final int ANSWERS_SUCCESSFULLY_ADDED = 2;
    public static final int TOKEN_ALLREADY_USED = 3;
    public static final int EVALUATION_CLOSED = 4;
    public static final int MALFORMED_REQUEST = 5;
    public static final int WRONG_DEVICE_ID = 6;
}
